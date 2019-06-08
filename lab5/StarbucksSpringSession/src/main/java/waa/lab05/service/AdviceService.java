package waa.lab05.service;

import java.util.List;
import java.util.Map;

public interface AdviceService {
	List<String> getAdvice(String roastOption);
	Map<String, String> getRoastOptions();
}
