package edu.mum.repository;

import java.util.List;

public interface DataFacadeRepository {
    public String findPassword(String name );
    public List<String> getAdvice(String roast);
}
