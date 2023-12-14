package com.example.security.auth;

import com.example.security.user.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "firstname can't be blank")
    private String firstname;

    @NotBlank(message = "lastname can't be blank")
    private String lastname;

    @NotBlank(message = "email can't be blank")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "password can't be blank")
    private String password;
    @NotNull(message = "role can't be null")
    private Role role;
}
