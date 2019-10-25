package com.ifun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create by iFun on 2019/10/24
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap modelMap) {
        modelMap.addAttribute("message", "Hello 中文");
        return "test";
    }
}
