package service.app.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.ansj.app.keyword.KeyWordComputer;
import org.ansj.app.keyword.Keyword;
import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.springframework.stereotype.Service;

@Service
public class LanProService {
	public List<String> getKeyWords(String question) {
		Result result = ToAnalysis.parse(question);
		//System.out.println(result);
		//List<Term> terms = result.getTerms();
		List<String> keyWords = new ArrayList<>();
		
		@SuppressWarnings("rawtypes")
		KeyWordComputer kwc = new KeyWordComputer(5);
		@SuppressWarnings("unchecked")
		Collection<Keyword> keyresult = kwc.computeArticleTfidf(question);
		//System.out.println(keyresult);
		
		for (Keyword kw : keyresult) {
			keyWords.add(kw.getName());
		}
		return keyWords;
	}
}
