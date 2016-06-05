package com.percepton.controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.percepton.entity.Product;

@Controller
public class DemoController 
{
	private static final Logger logger = Logger.getLogger(DemoController.class);
	
	
	 @RequestMapping(value="/")
	    public ModelAndView welcome(){
		 ModelAndView model = new ModelAndView("homepage");
	        String message = "Welcome to Spring MVC";
	        model.addObject("message", message);
	        
	        return model;
	    }
	 
	 // Map requests to product Page
	    @RequestMapping(value="/products")
	    public ModelAndView products(ModelAndView model){
	        ArrayList<Product> products = getAllProducts();
	        model.addObject("products",products);
	        model.setViewName("myapp.products");
	        return model;
	    }
	    
	    private ArrayList<Product> getAllProducts() {

	        ArrayList<Product> productList = new ArrayList<Product>();

	        Product p1 = new Product("Apple iPhone 5s","Smart Phone","iphone.jpg",250);
	        Product p2 = new Product("Samsung Galaxy S6","Smart Phone","s6.jpg",300);
	        Product p3 = new Product("LG Nexus 5","Smart Phone","nexus.jpg",100);
	        Product p4 = new Product("HTC One M9","Smart Phone","htc.jpg",300);

	        productList.add(p1);
	        productList.add(p2);
	        productList.add(p3);
	        productList.add(p4);

	        return productList;
	    }
	@RequestMapping(value="/demo")
	public String getScreen()
	{
		System.out.println("In Demo Controller");
		
		logger.info("In Demo Controller");
		return "login";
	}
}
