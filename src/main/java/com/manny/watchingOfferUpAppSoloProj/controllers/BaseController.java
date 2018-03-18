package com.manny.watchingOfferUpAppSoloProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/activation")
    public String activationRoute(){
        return "activation";
    }

    @RequestMapping("/howitworks")
    public String howItWorksRoute(){
        return "howitworks";
    }

    @RequestMapping("/alerts")
    public String alertsRoute(){
        return "alerts";
    }

    @RequestMapping("/results")
    public String resultsRoute(){
        return "results";
    }

    @RequestMapping("/search")
    public String searchRoute(){
        return "search";
    }

    @RequestMapping("/about")
    public String aboutRoute(){
        return "about";
    }

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }
}

