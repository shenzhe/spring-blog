package com.shenzhe.blog.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class MyFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        Map<String, String[]> params = req.getParameterMap();
//        Iterator iter = params.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            Object key = entry.getKey();
//            System.out.println("key:" + key.toString());
//            String[] val = (String[]) entry.getValue();
//            for (String v : val) {
//                System.out.println("value:" + v);
//            }
//        }
//
//        System.out.println("my filter, ulr:" + req.getRequestURI());
        filterChain.doFilter(request, response);

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }

}
