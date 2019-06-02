package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.service.CalculatorService;
import mum.edu.validator.CalculatorValidator;

@Controller
public class CalculatorController {
	@AutoWired
	CalculatorValidator calculatorValidator;
	
	@AutoWired
	CalculatorService calculatorService;
	
	@RequestMapping(value={"/", "/calculator"})
	public String inputValuesToCalculate(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}
	
	@RequestMapping(value="/result")
	public String displayCalculatedValues(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = calculatorValidator.validate(calculator);
		if(errors.isEmpty()) {
			calculatorService.compute(calculator);
			//store calculator in a scope variable for the view
			request.setAttribute("calculator", calculator);
			return "/WEB-INF/jsp/result.jsp";
			
		} else {
			//store errors and calculator in a scope variable for the view
			request.setAttribute("errors", errors);
			request.setAttribute("form", calculator);
			return "/WEB-INF/jsp/calculator.jsp";
		}
	}
}
