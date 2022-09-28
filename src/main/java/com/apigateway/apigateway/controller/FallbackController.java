package com.apigateway.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {



    @GetMapping("/userServiceFallback")
    public String userserviceFallback(){
          return "User Service is Down";
    }


    @GetMapping("/contactServiceFallback")
    public String contactserviceFallback(){

        return "Contact Service is Down";
    }
}
