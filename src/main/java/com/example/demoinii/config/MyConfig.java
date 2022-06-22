package com.example.demoinii.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //为当前工程的所有路径配置跨域问题
                registry.addMapping("/**")
                        //允许所有来源跨域
                        .allowedOrigins("*")
                        //允许所有请求头跨域
                        .allowedHeaders("*")
                        //允许所有请求方式跨域
                        .allowedMethods("*");
            }
        };
    }
}

