package com.database.MongodbService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableSwagger2
@EnableEurekaClient
public class MongodbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbServiceApplication.class, args);
	}

}
