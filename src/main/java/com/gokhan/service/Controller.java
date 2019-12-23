package com.gokhan.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/test")
    public String index() {
        String returnedValue = "Hello World";
        try{
            return "{\"test\":\""+returnedValue+"\"}" ;//new ObjectMapper().writeValueAsString(returnedValue);
        }catch(Exception ex){
            ex.printStackTrace();
            return "";
        }

    }

}
