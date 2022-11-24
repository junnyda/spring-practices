package com.bitacademy.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig01 {
	
	@Bean
	public User user() {
		return new User();
	}

}
