package com.server.backend.controller.Reports;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "reports", description = "Reports UI pages and documentation endpoints")
@Controller
public class ReportsController {

    @GetMapping("/reports/swagger")
    public String apiDocs() {
        return "swagger";
    }

}
