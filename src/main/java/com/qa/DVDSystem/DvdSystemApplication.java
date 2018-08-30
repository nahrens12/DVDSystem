package com.qa.DVDSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DvdSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdSystemApplication.class, args);
	}
}
