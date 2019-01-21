package com.vasu.SpringJdbcAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringJdbcAuthenticationApplication extends  SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(SpringJdbcAuthenticationApplication.class);
    }

    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcAuthenticationApplication.class, args);
	}

}

