package com.example.springboot.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class OrderdetailController {

    @GetMapping("/orderdetail")// url direction not the same as file direction
    public ModelAndView orderdateail() {
        ModelAndView response = new ModelAndView("/orderdetail");// jsp file name, in this case also specifying the directory
        return response;
    }
}
