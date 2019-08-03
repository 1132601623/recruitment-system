package com.xcy.recruitmentsystem.userInterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Component
public class AfterLoginInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object username =  session.getAttribute("username");
        System.out.println(username);
        if(username == null){
            String projectName  = request.getContextPath();
            response.sendRedirect(projectName+"/Index.html");
            return false;
        }
        System.out.println("preHandler执行");
        return true;
    }

    //处理器执行之后，视图解析器执行之前
    // 这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("postHandle方法执行");
    }

    //处理器执行完毕，视图解析器执行完毕之后
    // 可以进行一些日志的记录
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法执行");
    }
}


