package com.capture.transaction.digibank;

import com.capture.transaction.digibank.model.TransDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.capture.transaction.digibank.repository")
@EntityScan("com.capture.transaction.digibank")
public class DigibankApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigibankApplication.class, args);
	}

}
