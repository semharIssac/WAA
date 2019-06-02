package mum.edu.service;

import mum.edu.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService{
	@Override
	public void compute(Calculator calculator) {
		calculator.add();
		calculator.multiply();
	}
}
