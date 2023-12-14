package com.example.security;

import com.example.security.auth.AuthService;
import com.example.security.auth.RegisterRequest;
import com.example.security.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.security.user.Role.*;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthService authService
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@gmail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + authService.register(admin).getAccessToken());
			var manager = RegisterRequest.builder()
					.firstname("Manager")
					.lastname("Manager")
					.email("manager@gmail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + authService.register(manager).getAccessToken());
		};
	}
}
