package com.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
public class WebInitilizer1 implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        XmlWebApplicationContext ctx=new XmlWebApplicationContext();
//        ctx.setConfigLocation("classpath:web-config.xml");

        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        //create a dispacher servlet object
        DispatcherServlet dispatcherServlet=new DispatcherServlet(ctx);

        //register dispahcer servlet with servlet context
        ServletRegistration.Dynamic myCustomDiServletRegistration=servletContext.addServlet
                ("mydispatcherServlet", dispatcherServlet);

        myCustomDiServletRegistration.setLoadOnStartup(1);
        myCustomDiServletRegistration.addMapping("/");
    }
}*/
