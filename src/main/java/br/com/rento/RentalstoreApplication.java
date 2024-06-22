package br.com.rento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RentalstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalstoreApplication.class, args);
	}

}
