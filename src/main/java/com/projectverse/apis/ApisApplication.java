package com.projectverse.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
@SpringBootApplication
public class ApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisApplication.class, args);


		Dotenv dotenv = Dotenv.load();
		String apiKey = dotenv.get("API_KEY");

	}

}
