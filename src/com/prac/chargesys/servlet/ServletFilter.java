package com.prac.chargesys.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName ServletFilter
 * @Description
 * @Date 2022/12/7 21:28
 * @Version 1.0
 */
@WebFilter(urlPatterns = {"*.do"})
public class ServletFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(";;;;;;");
        ((HttpServletResponse)servletResponse).setContentType("text/html;charset=utf-8");

        /*设置响应头允许ajax跨域访问*/
        ((HttpServletResponse)servletResponse).setHeader("Access-Control-Allow-Origin", "*");

        /* 星号表示所有的异域请求都可以接受， */
        ((HttpServletResponse)servletResponse).setHeader("Access-Control-Allow-Methods", "GET,POST");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
