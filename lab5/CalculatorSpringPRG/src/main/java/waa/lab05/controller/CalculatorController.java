package waa.lab05.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import waa.lab05.domain.Calculator;
import waa.lab05.service.CalculatorService;
import waa.lab05.validator.CalculatorValidator;
import waa.lab05.validatorimpl.CalculatorValidatorImpl;


@Controller
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping(value={"/", "/calculator"}, method=RequestMethod.GET)
	public String displayCalculatorForm() {
		return "calculator";
	}
	
	@RequestMapping(value= {"/calculator"}, method=RequestMethod.POST)
	public String handleCalculatorForm(Calculator calculator, RedirectAttributes redirectAttributes) {
		//Temporary: validation just to avoid errors
		CalculatorValidator calculatorValidator = new CalculatorValidatorImpl();
		List<String> errors = calculatorValidator.validate(calculator);
		if(errors.isEmpty()) {
			calculatorService.compute(calculator);
			redirectAttributes.addFlashAttribute("calculator", calculator);
			redirectAttributes.addFlashAttribute("greeting", "Greetings!");
			return "redirect:result";
			
		} else {
			return "redirect:calculator";
		}
	}
	
	@RequestMapping(value= {"/result"}, method = RequestMethod.GET)
	public String displayCalculatedValues(Model model) throws IOException {
		Calculator calculator = (Calculator) ((ModelMap) model).get("calculator");
		if(calculator == null) {
			throw new IOException("Sorry, Try Again!");
		} else {
			return "result";
		}
	}
}