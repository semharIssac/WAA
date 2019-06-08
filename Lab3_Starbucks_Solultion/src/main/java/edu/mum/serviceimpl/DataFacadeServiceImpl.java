package edu.mum.serviceimpl;

import edu.mum.repository.DataFacadeRepository;
import edu.mum.service.DataFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DataFacadeServiceImpl implements DataFacadeService {

    @Autowired
    private DataFacadeRepository dataFacadeRepository;
    @Override
    public String findPassword(String name) {
        return dataFacadeRepository.findPassword(name);
    }

    @Override
    public List<String> getAdvice(String roast) {
        return dataFacadeRepository.getAdvice(roast);
    }
}
