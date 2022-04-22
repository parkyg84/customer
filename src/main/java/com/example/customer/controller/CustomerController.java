package com.example.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CustomerApi")
public class CustomerController {

    //@ResponseBody
    @RequestMapping(method = RequestMethod.GET, path ="/getCustInfo")
    public String CustomerHome()
    {
        System.out.println("customerId start");

        return "customerId is yongpark";
    }
}
