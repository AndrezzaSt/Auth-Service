package com.example.AuthService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class AuthServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AuthServiceApplication.class, args);


	}


}
