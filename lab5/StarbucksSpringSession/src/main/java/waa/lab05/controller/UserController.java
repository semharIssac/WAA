package waa.lab05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import waa.lab05.domain.User;
import waa.lab05.service.UserService;

@Controller
@SessionAttributes("userName")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value= {"/", "/login"}, method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user, Model model) {
		boolean isAuthenticated = userService.authenticate(user);
		if(isAuthenticated) {
			model.addAttribute("userName", user.getUserName());
			return "redirect:login-successful";
		} else {
			return "redirect:login";
		}
		
	}
	
	@RequestMapping(value="/login-successful", method=RequestMethod.GET)
	public String displayLoginSuccessful() {
		return "login-successful";
	}
	
	@RequestMapping(value= {"/logout"}, method=RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:login";
	}
}
