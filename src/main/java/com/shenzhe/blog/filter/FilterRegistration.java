package com.shenzhe.blog.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistration {

//    @Bean
//    public RemoteIpFilter remoteIpFilter() {
//        return new RemoteIpFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean authFilterRegistrationBean() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new AuthFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("AuthFilter");
//        registration.setOrder(1);
//        return registration;
//    }
//
//    @Bean
//    public FilterRegistrationBean myFilterRegistrationBean() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new MyFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("MyFilter");
//        registration.setOrder(0);
//        return registration;
//    }

}
