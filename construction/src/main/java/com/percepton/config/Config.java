package com.percepton.config;  
  
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.web.servlet.config.annotation.EnableWebMvc;  
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.JstlView;  
import org.springframework.web.servlet.view.UrlBasedViewResolver;  
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
  
@Configuration //Marks this class as configuration
//Specifies which package to scan
@ComponentScan("com.percepton")
//Enables Spring's annotations 
@EnableWebMvc   
public class Config
{     
    @Bean  
    public UrlBasedViewResolver setupViewResolver() 
    {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }  
    
    @Bean
    TilesViewResolver viewResolver(){
        TilesViewResolver viewResolver = new TilesViewResolver();
        return viewResolver;
    }

    @Bean
    TilesConfigurer tilesConfigurer(){
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions("WEB-INF/views/tiles/tiles.xml");
        tilesConfigurer.setPreparerFactoryClass(org.springframework.web.servlet.view.tiles3.SpringBeanPreparerFactory.class);
        return tilesConfigurer;    
    }
  
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
}
}  
