package com.Sharedproassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Sharedproassignment")
public class SharedproAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharedproAssignmentApplication.class, args);
	}

}
