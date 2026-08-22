package com.server.backend.controller.Reports;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String hello() {
        return "Working";
    }
}
