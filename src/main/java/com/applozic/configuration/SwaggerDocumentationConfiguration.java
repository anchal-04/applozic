package com.applozic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Component
public class SwaggerDocumentationConfiguration {
	@Bean
	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Applozic Assignment")
				.description("Api to handle movies to be selected by an actor").license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").termsOfServiceUrl("").version("1.0.0")
				.build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).build().apiInfo(apiInfo())
				.tags(new Tag("Movies", "API for handling movie details"));
	}

}
