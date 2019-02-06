package com.json.writejson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WritejsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(WritejsonApplication.class, args);
	}


	public static void writeJson() {
		System.out.println("hello");
	}

}

