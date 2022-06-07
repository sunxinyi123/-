package com.example.text2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {//试图解析器

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").//拦截哪些请求 所有请求都拦截
                excludePathPatterns("/index.html","/","/user/login","/css/*","/js/**","/img/**"); // 有些请求不能拦截拦截怎么办，排除一些拦截,放行

        //该方法在请求处理之前被调用，若在一个应用中或者一个请求中存在多个Interceptor，
        // 每个Interceptor的调用会根据他的声明顺序依次执行；方法返回Boolean类型，当返回false时，
        // 表示请求结束，后续的Interceptor和Controller将不会再执行，当返回true时，
        // 会据需调用下一个Interceptor的preHandle方法，执行到最后一个Interceptor，就会调用当前请求的控制器方法。

    }
    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");





    }
}
