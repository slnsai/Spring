package com.ksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"com.ksoft.controllers"})
public class WebMvcConfig extends WebMvcConfigurerAdapter
{

	/*@Override
	public void addViewControllers(ViewControllerRegistry registry) 
	{
		registry.addViewController("/welcome.htm").setViewName("welcome");
		registry.addViewController("/registration.htm").setViewName("registration");
		
	}*/

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
}
