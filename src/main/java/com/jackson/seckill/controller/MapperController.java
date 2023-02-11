package com.jackson.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@Controller
@RequestMapping("/demo")
public class MapperController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","jackson");
        return "hello";
    }

}
