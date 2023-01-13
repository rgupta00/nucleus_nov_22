package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//u dont need to put any annotation of spring famrework ...
//tomcat  will pick that class
public class Init extends AbstractAnnotationConfigDispatcherServletInitializer {

    // bada                 chota
    //servletContext vs WebApplicationContext

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("-----------");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("*********");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
