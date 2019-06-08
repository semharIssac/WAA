package edu.mum.controller;


import edu.mum.domain.User;
import edu.mum.service.DataFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("")
public class AutheticationController {

    @Autowired
    private DataFacadeService  dataFacadeService;

    @GetMapping({"/","/login"})
   public String getLogin()
    {
       return "login";
   }

   //@PostMapping({"/","/login"})
   @RequestMapping( value = "/login", method = RequestMethod.POST)
   public String postLogin(User user){
       String expectedPassword = dataFacadeService.findPassword(user.getName());

       if(expectedPassword == null || !expectedPassword.equals(user.getPassword())) {

           return "login";

           //			throw new RuntimeException("Username or Password is invalid");
       } else {
               return "LoginSuccessful";


       }

   }

}
