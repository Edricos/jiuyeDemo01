package com.example.demo01.interceptor;

import com.example.demo01.util.TokenUtil;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TokenInterceptor implements HandlerInterceptor {
    // 重写 前置拦截方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1、从请求头中获取token
        String token = request.getHeader("token");
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies);
        for (Cookie cookie : cookies) {
            if ("token".equals(cookie.getName())){
                token=cookie.getValue();
            }
        }
        System.out.println(token);
        // 2、判断 token 是否存在
        if (token == null || "".equals(token)) {
            response.setStatus(401);
            System.out.println("未登录");
            return false;
        }

        // 3、解析token
        if(!TokenUtil.verify(token)){
            System.out.println("验证失败");
            response.setStatus(401);
            return false;
        }
        return true;
    }
}