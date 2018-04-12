package service.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.app.model.ErrCode;
import service.app.model.RequestData;
import service.app.model.ResponceAnswer;
import service.app.service.LanProService;

@Controller
public class IndexController {
	
	@Autowired
	LanProService lpSer;
	
	
	
	//private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/getAnswers")
	@ResponseBody
	public ResponceAnswer getAnswers(HttpServletResponse response,RequestData data) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		List<String> keyWords =  lpSer.getKeyWords(data.getQuestion());
		
		ResponceAnswer ra = new ResponceAnswer();
		ra.setErrCode(ErrCode.Answer_OK);
		ra.setKeyWords(keyWords);
		return ra;
	}
}
