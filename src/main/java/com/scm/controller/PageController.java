package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String Home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "ashish sharma");
        model.addAttribute("youtubeChannel", "mighty gamers");
        model.addAttribute("githubRepo","https://github.com/ashish85059");
        return "home";
    }

    // about page
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        System.out.println("about page handler");
        return "about";
    }

    // services page
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page handler");
        return "services";
    }

}
