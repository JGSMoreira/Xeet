package net.behaze.xeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class XeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(XeetApplication.class, args);
	}

}