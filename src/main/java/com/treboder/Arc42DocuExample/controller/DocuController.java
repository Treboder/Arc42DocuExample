package com.treboder.Arc42DocuExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DocuController {

    @GetMapping("doc")
    public String getDocu() {
        return "00_arc42"; // lets Thymeleaf fetch the 00_arc42.html from resources/templates
    }

}
