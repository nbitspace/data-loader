package com.salesforce.crm;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {"com.salesforce.crm.user"})
public class SalesforceCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesforceCrmApplication.class, args);
	}

}
