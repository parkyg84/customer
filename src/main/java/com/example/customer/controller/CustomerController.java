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





        //1.

        //2.

        //3.

        //4.

        //5.

        //6.

        //7.

        //8.

        //9.

        //10.

        //11.
<<<<<<< HEAD

        //12.
=======
>>>>>>> d1c1541 (커밋테스트2)
        return "customerId is yongpark";
    }
}
