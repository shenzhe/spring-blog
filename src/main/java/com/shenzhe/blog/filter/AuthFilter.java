package com.shenzhe.blog.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
//        String token = req.getParameter("token");
//        if (!token.equals("123")) {
//            HttpServletResponse res = (HttpServletResponse) response;
//            res.sendRedirect("/login?token=123");
//            return;
//        }
//        System.out.println("my ip:" + req.getRemoteAddr());
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }
}
