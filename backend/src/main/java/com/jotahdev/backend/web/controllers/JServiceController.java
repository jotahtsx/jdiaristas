package com.jotahdev.backend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jotahdev.backend.core.models.JService;

@Controller
@RequestMapping("/admin/servicos")
public class JServiceController {
    
    @GetMapping("/cadastrar")
    public ModelAndView create() {
        var modelAndView = new ModelAndView("admin/service/create");

        modelAndView.addObject("service", new JService());

        return modelAndView;
    };
}
