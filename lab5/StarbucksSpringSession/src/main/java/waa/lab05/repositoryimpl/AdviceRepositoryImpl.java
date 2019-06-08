package waa.lab05.repositoryimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.lab05.database.Database;
import waa.lab05.repository.AdviceRepository;

@Service
public class AdviceRepositoryImpl implements AdviceRepository{
	@Autowired
	Database dataBase;
	
	@Override
	public List<String> getAdvice(String roast) {
		return dataBase.roastOptionToAdviceMap.get(roast);
	}

	@Override
	public Map<String, String> getRoastOptions() {
		return dataBase.roastOptionMap;
	}

}
