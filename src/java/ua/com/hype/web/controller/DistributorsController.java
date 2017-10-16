package ua.com.hype.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Алексей on 16.10.2017.
 */
@Controller
@RequestMapping("/distributors")
public class DistributorsController {

    @RequestMapping(value = "/distributors", method = RequestMethod.GET)
    public ModelAndView getHomePage(){
        ModelAndView modelAndView = new ModelAndView("distributors.jsp");
        return modelAndView;
    }
}
