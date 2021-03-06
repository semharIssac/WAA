package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator{

	@Override
	public List<String> validate(Object calcObj) {
		List<String> errors = new ArrayList<String>();
		
		Calculator calculator = (Calculator) calcObj;
		
		if(calculator.getAddOperand1() == null) {
			errors.add("first operand to add must have a value");
		}
		
		if(calculator.getAddOperand2() == null) {
			errors.add("second operand to add must have a value");
		}
		
		if(calculator.getMultOperand1() == null) {
			errors.add("first operand to multiply must have a value");
		}
		
		if(calculator.getMultOperand2() == null) {
			errors.add("second operand to multiply must have a value");
		}
		return errors;
	}
	

}
