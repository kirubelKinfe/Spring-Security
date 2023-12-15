package com.example.security.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {
    @Operation(
            description = "Get endpoint for manager",
            summary = "Gets all the managers in our system.",
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
    public String getManager() {
        return "GET:: management controller";
    }
    @Operation(
            description = "Post endpoint for manager",
            summary = "Create a new manager in our system.",
            responses = {
                    @ApiResponse(
                            description = "Created",
                            responseCode = "201"
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
    @PostMapping
    public String createManager() {
        return "POST:: management controller";
    }
    @Operation(
            description = "Put endpoint for manager",
            summary = "Updates a manager in our system.",
            responses = {
                    @ApiResponse(
                            description = "Ok",
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
    @PutMapping
    public String updateManager() {
        return "PUT:: management controller";
    }
    @Operation(
            description = "Delete endpoint for manager",
            summary = "Deletes a manager from our system.",
            responses = {
                    @ApiResponse(
                            description = "Ok",
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
    @DeleteMapping
    public String deleteManager() {
        return "DELETE:: management controller";
    }
}
