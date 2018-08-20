package com.dreamyao.demo.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jsonp")
public class JsonpController {

    @RequestMapping(value = "test1", method = RequestMethod.POST)
    public String test1(@RequestParam String callback){
        return callback+"(hello)";
    }
}
