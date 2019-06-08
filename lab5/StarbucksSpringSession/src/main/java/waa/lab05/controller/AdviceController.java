package waa.lab05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import waa.lab05.service.AdviceService;

@Controller
public class AdviceController {
	@Autowired
	AdviceService adviceService;
	
	@RequestMapping(value= "/advice", method=RequestMethod.GET)
	public String roastOption(Model model) {
		model.addAttribute("roasts", adviceService.getRoastOptions());
		return "advice";
	}
	
	@RequestMapping(value="/advice", method=RequestMethod.POST)
	public String handleRoast(@RequestParam("roast") String roastOption, Model model, RedirectAttributes redirectAttributes) {
		if(roastOption.equals("-")) {
			redirectAttributes.addFlashAttribute("roasts", adviceService.getRoastOptions());
			return "redirect:advice";
		}
		model.addAttribute("roast", roastOption);
		model.addAttribute("roastList", adviceService.getAdvice(roastOption));
		return "display";
	}
	
}
