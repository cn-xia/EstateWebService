/*package service.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
	
	private final static String API_KEY = "AIzaSyAB47tp2jJYwm1136krSRiksoBdLlGP8qM";
	private final static String SEARCH_ID = "001544261301121368412:csncfzyjp40";
	private final static Logger logger = LoggerFactory.getLogger(SearchService.class);
	
	public void searchByGoogle(String strQuery) {
		int num = 10;
		String strurl = "https://www.googleapis.com/customsearch/v1?key="+API_KEY+"&cx="+SEARCH_ID+"&num="+num+"&q="+strQuery;  	
		//String strurl = "https://www.sojson.com/open/api/weather/json.shtml?city=北京";
		
		
		
		String result ="";
		try {
			URL searchURL = new URL(strurl);
			HttpURLConnection conn = (HttpURLConnection)searchURL.openConnection();
			conn.setRequestMethod("GET");
			int resultCode = conn.getResponseCode(); 
			if(resultCode == 200) {
				InputStream is = conn.getInputStream();
				result = Tools.readAsString(is);
				is.close();
				logger.info("success"+resultCode);
			}else {
				logger.error("Fault on getting http result, code:"+resultCode);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result);
		
		
		
	}
	
}
*/