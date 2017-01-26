package com.srikanth.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SrikanthApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SrikanthApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SrikanthApplication.class, args);
	}
}
