package com.percepton.config;

import javax.servlet.ServletContext;  
import javax.servlet.ServletException;  
import javax.servlet.ServletRegistration.Dynamic;  

import org.springframework.web.WebApplicationInitializer;  
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;  
import org.springframework.web.servlet.DispatcherServlet;  
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
  
public class WebInitializer implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException 
	{    
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(Config.class);  
        ctx.setServletContext(servletContext);    
        
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        servlet.addMapping("/");  
        servlet.setLoadOnStartup(1);        
    }  
	 /*public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }*/
}
