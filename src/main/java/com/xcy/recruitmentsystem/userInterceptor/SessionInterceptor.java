package com.xcy.recruitmentsystem.userInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SessionInterceptor implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List list = new ArrayList();
        list.add("/Index.html");
        //拦截
        registry.addInterceptor(new AfterLoginInteceptor()).addPathPatterns("/user").excludePathPatterns(list);

    }
}
