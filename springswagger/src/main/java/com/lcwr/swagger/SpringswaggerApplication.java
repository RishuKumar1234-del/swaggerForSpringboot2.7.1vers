package com.lcwr.swagger;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringswaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringswaggerApplication.class, args);
	}
	
	
	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/book/*"))
				.apis(RequestHandlerSelectors.basePackage("com.lcwr.swagger"))
				.build()
				.apiInfo(apiCustomData());
	}
	
	private ApiInfo apiCustomData(){
		return new ApiInfo(
				"Cloud Vendor API Application",
				"Cloud Vendor Documentation",
				"1.0",
				"Cloud Vendor Service Terms",
				new Contact("Rishu kumar", "http://rishuk525@gmail.com",
						"ranjeetkumar123@gmail.com"),
				"believe in your dreams",
				"http://hub.rishugithub.com",
				Collections.emptyList()
		);

	}


}
