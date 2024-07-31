package com.abhi.OnlineGroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.abhi.OnlineGroceryStore.repository")
@EntityScan(basePackages = "com.abhi.OnlineGroceryStore.model")
public class OnlineGroceryStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineGroceryStoreApplication.class, args);
	}

}
