package com.frame.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 桑智勇(homesangsang)
 * Date: 2018-05-11
 * Time: 17:14
 */
@Controller
public class HomeController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
