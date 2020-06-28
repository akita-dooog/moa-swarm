package com.akita.moa.govern.config;

import com.akita.moa.common.config.AbstractSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends AbstractSwaggerConfig {

    @Override
    public String basePackagePath() {
        return "com.akita.moa.govern.controller";
    }

    @Override
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户部门管理模块")
                .description("用户、部门、角色、权限管理")
                .contact(new Contact("akita", "", ""))
                .version("1.0.0")
                .build();
    }
}
