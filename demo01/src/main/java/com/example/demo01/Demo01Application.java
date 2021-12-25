package com.example.demo01;

import com.example.demo01.interceptor.TokenInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class Demo01Application {
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOriginPatterns("*").allowCredentials(true);
//                registry.addMapping("/**").allowedHeaders("token", "Content-Type");
//                registry.addMapping("/**").exposedHeaders("token", "Content-Type");
//
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
////        super.addInterceptors(registry);
//        registry.addInterceptor(new AccountInterceptor()).addPathPatterns("/**").
//                excludePathPatterns("/","/user/**");
                registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").
                        excludePathPatterns("/","/user/**","/index/**");

            }
        };
    }
}
