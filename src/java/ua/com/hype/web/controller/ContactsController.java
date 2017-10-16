package ua.com.hype.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Алексей on 16.10.2017.
 */

@Controller
public class ContactsController {

    @RequestMapping(value = "/contact")
    public ModelAndView contactsPage() {
        ModelAndView modelAndView = new ModelAndView("contacts.jsp");
        return  modelAndView;
    }
}