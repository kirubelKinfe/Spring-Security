package com.example.security.admin;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {
    @GetMapping
    public String getManager() {
        return "GET:: management controller";
    }
    @PostMapping
    public String createManager() {
        return "POST:: management controller";
    }
    @PutMapping
    public String updateManager() {
        return "PUT:: management controller";
    }
    @DeleteMapping
    public String deleteManager() {
        return "DELETE:: management controller";
    }
}
