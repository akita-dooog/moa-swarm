package com.akita.moa.desk.config;

import com.akita.moa.common.config.AbstractSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

@Configuration
public class SwaggerConfig extends AbstractSwaggerConfig {
    @Override
    public String basePackagePath() {
        return "com.akita.moa.desk.controller";
    }

    @Override
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("工作台")
                .description("banner、应用")
                .version("1.0")
                .build();
    }
}
