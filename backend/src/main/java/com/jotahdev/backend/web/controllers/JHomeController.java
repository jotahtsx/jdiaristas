package com.jotahdev.backend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JHomeController {

    @GetMapping({"/admin", "/admin/"})
    public String showDashboard() {
        return "admin/dashboard";
    }
}
