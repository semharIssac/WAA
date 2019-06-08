package waa.lab05.repository;

import java.util.List;
import java.util.Map;

public interface AdviceRepository {
	List<String> getAdvice(String roast);
	Map<String, String> getRoastOptions();
}
