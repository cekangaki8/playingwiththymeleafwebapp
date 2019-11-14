package com.porsetech.learning.playingwiththymeleafwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index controller will be the main controller for everything to do with the index page
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }


}
