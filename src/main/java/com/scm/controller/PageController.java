package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
    System.out.println("Home page handler");
    //sending data to view screen -home page 
    model.addAttribute("name","ayooo");
    model.addAttribute("project", "Spring MVC");
    model.addAttribute("link","https://stackoverflow.com/questions/71099496/anyone-using-vscode-for-developing-springboot-project");

        return "home"; 
    }
}
