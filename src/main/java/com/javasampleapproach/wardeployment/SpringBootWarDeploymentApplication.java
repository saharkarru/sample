package com.javasampleapproach.wardeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWarDeploymentApplication  extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWarDeploymentApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDeploymentApplication.class, args);
	}
}
