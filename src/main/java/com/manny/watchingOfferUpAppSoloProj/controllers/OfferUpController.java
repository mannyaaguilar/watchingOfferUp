package com.manny.watchingOfferUpAppSoloProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class OfferUpController {

    @RequestMapping("/offerUp")
    public @ResponseBody
    String offerUpRoute(){
        final String uri = "http://api.giphy.com/v1/gifs/search?q=ryan+gosling&api_key=8b6jqzb77sJ11lkhP2MoGZNzFfmfifQ2&limit=5";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}
