package com.covid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.math.BigDecimal;

@SpringBootApplication
@EnableWebMvc
public class StartCovidApplication {

	
	@Bean
	public RestTemplate getRestTemplate(){return new RestTemplate();}
    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartCovidApplication.class, args);
    }

    // run this only on profile 'demo', avoid run this in test
	/* */
}