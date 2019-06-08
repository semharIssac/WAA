package waa.lab05.serviceimpl;

import org.springframework.stereotype.Service;

import waa.lab05.domain.Calculator;
import waa.lab05.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{
	@Override
	public void compute(Calculator calculator) {
		calculator.add();
		calculator.multiply();
	}
}