package com.deca.securitysquad16.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class OpenAPIConfig {

    @Bean
    public OpenAPI config() {
        return new OpenAPI().info(
                new Info()
                        .title("Security-Squad016")
                        .version("V1.0")
                        .description("Security for Rest APIs... and MVCs")
        );
    }
}