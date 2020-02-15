package com.howells.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chrish on 15/02/2020.
 */
@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/test/name")
    public String getName() {
        return "Chris";
    }

}
