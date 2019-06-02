package edu.mum.controller;



import edu.mum.service.DataFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/advice")
public class AdviceController {

    @Autowired
    private DataFacadeService dataFacadeService;

    @RequestMapping( value = "", method = RequestMethod.GET)
    public String getAdvice(Model model){
        Map< String, String > roastMap = new HashMap<String, String>();

        roastMap.put("Light", "light");
        roastMap.put("Medium", "medium");
        roastMap.put("Dark", "dark");

        model.addAttribute("roasts", roastMap);
        return "advice";

    }
    @RequestMapping( value = "", method = RequestMethod.POST)
    public String postAdvice(HttpServletRequest request, Model model){
        String roast = request.getParameter("roast");

        List<String> advice = dataFacadeService.getAdvice(roast);
        model.addAttribute("roastList",advice);
        return "display";
    }
}
