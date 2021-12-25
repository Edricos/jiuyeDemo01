//package com.example.demo01.filter;
//
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Order(1)  //设置优先级
//@WebFilter(filterName = "CoreFilter", value = {"/**"})
//public class CoreFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
////        printColorUtil.println("跨域过滤器启动了", ColorEnum.BLUE.getCode(), ColorEnum.WHITE.getCode());
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;
//        // 设置服务器会接收来自 任意域名的请求
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        // 设置允许携带cookie
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        // 设置允许访问的方法
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, GET");
//        // 设置预检请求(options)可以保存的时间,即在这个时间内不再发起预检请求
//        response.setHeader("Access-Control-Max-Age", "3600");
//        // 设置服务器支持的所有头信息字段,这里的Authorization是自定义的
//        response.setHeader("Access-Control-Allow-Headers",
//                "Content-Type,Content-Length,Authorization,Accept,X-Requested-With,token");
//        // 设置允许前端发送的请求头
//        response.setHeader("Access-Control-Request-Headers", "token");
//        // 暴露头信息,在响应头夹带信息给前端也要加这句话才好使
//        response.setHeader("Access-Control-Expose-Headers", "token");
//        if ("OPTIONS".equals(request.getMethod())) {
//            // 进行我们定义的请求前，浏览器自动发起的options请求
//            System.out.println("options");
//            // 服务器正常接收，返回状态码，不响应其他内容
//            response.setStatus(HttpStatus.ACCEPTED.value());
//            return;
//        } else {
//            // 非options请求，放行
//            chain.doFilter(request, response);
//        }
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    }
//
//    @Override
//    public void destroy() {
//    }
//}
