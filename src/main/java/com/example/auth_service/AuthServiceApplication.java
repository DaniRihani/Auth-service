package com.example.auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class AuthServiceApplication {

	private static final List<AuthServiceUser> USERS = Arrays.asList(
			new AuthServiceUser("user1", "pass1"),
			new AuthServiceUser("user2", "pass2"),
			new AuthServiceUser("user3", "pass3")
	);

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

	@PostMapping("/auth")
	public String authenticate(@RequestBody AuthServiceUser user) {
		return USERS.contains(user) ? "yes" : "no";
	}
}
