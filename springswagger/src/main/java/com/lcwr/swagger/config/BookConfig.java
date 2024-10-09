package com.lcwr.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class BookConfig {
	
//	@Bean
//	public Docket postApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("lear code with rishu").apiInfo(apiInfo()).select()
//				.paths(e->e.matches("/book/**")).build();
//	}
//	
//	private ApiInfo apiInfo() {
//		
//		return new ApiInfoBuilder().title("BookService")
//				.description("sample documentation generated using swagger2 for our rest Api")
//				.termsOfServiceUrl("https://www.google.com")
//				.license("learn_code_with_rishu")
//				.version("1.0").build();
//	}
	

//	    private static final String TITLE = "Flight API";
//	    private static final String DESCRIPTION = "Descripcion API Flight";
//	    private static final String BASE_PACKAGE = "com.lcwr.swagger.controller";
//	    private static final String VERSION = "v1";
//	    @Bean
//	    public Docket swagger() {
//	        return new Docket(DocumentationType.SWAGGER_2)
//	                .select()
//	                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
//	                .build()
//	                .forCodeGeneration(true)
//	                .apiInfo(new ApiInfoBuilder().title(TITLE).description(DESCRIPTION).version(VERSION).build());
//	    }

	}

