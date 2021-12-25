//package com.example.demo01.config;
//
//import com.example.demo01.interceptor.AccountInterceptor;
//import com.example.demo01.interceptor.TokenInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class MyMvcConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//////        super.addInterceptors(registry);
////        registry.addInterceptor(new AccountInterceptor()).addPathPatterns("/**").
////                excludePathPatterns("/","/user/**");
//        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").
//                excludePathPatterns("/","/user/**","/index/**");
//
//    }
//}
