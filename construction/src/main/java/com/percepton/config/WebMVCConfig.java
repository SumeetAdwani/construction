package com.percepton.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMVCConfig extends WebMvcConfigurerAdapter 
{
	  @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	  
	    }

	    // equivalent for <mvc:default-servlet-handler/> tag
	   /* @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }*/
}
