package com.example.security.admin;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public String getAdmin() {
        return "GET:: admin controller";
    }
    @PostMapping
    public String createAdmin() {
        return "POST:: admin controller";
    }
    @PutMapping
    public String updateAdmin() {
        return "PUT:: admin controller";
    }
    @DeleteMapping
    public String deleteAdmin() {
        return "DELETE:: admin controller";
    }
}
