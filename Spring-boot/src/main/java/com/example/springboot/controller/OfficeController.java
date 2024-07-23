package com.example.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class OfficeController {

    @GetMapping("/office")// url direction not the same as file direction
    public ModelAndView office() {
        ModelAndView response = new ModelAndView("/office");// jsp file name, in this case also specifying the directory
        return response;
    }
}
