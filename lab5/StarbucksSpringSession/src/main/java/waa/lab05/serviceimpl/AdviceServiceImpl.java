package waa.lab05.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.lab05.repository.AdviceRepository;
import waa.lab05.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService{
	@Autowired
	AdviceRepository adviceRepository;
	
	@Override
	public List<String> getAdvice(String roastOption) {
		return adviceRepository.getAdvice(roastOption);
	}

	@Override
	public Map<String, String> getRoastOptions() {
		return adviceRepository.getRoastOptions();
	}

}
