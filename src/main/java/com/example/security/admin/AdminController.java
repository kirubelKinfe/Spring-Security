package com.example.security.admin;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@Tag(name = "Admin")
public class AdminController {
    @Operation(
            description = "Get endpoint for admin",
            summary = "Gets all the admins in our system.",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Bad Request",
                            responseCode = "400"
                    ),
                    @ApiResponse(
                            description = "Unauthorized | Invalid Token",
                            responseCode = "403"
                    ),
                    @ApiResponse(
                            description = "Internal Server Error",
                            responseCode = "500"
                    )
            }
    )
    @GetMapping
    public String getAdmin() {
        return "GET:: admin controller";
    }
    @PostMapping
    @Hidden
    public String createAdmin() {
        return "POST:: admin controller";
    }
    @PutMapping
    @Hidden
    public String updateAdmin() {
        return "PUT:: admin controller";
    }
    @DeleteMapping
    @Hidden
    public String deleteAdmin() {
        return "DELETE:: admin controller";
    }
}
