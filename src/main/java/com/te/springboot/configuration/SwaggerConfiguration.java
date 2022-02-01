package com.te.springboot.configuration;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {


	@Bean
	public Docket SwaggerApiConfig() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.securityContexts(Arrays.asList()).securitySchemes(Arrays.asList()).select()
				.apis(RequestHandlerSelectors.basePackage("com.te.springboot")).paths(PathSelectors.any())
				.build();
	} 
 
	private ApiInfo apiInfo() {
		return new ApiInfo("BANKING APPLICATION",
				"BANKING APPLICATION", "1", "Terms of Service",
				new Contact("maruthi", "www.swagger.com", "maruthiaarya.com"), "LIcense of API",
				"API License URL", Collections.emptyList());
	}
	
}
