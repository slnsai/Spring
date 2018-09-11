package com.ksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.ksoft")
public class WebMvcConfig extends WebMvcConfigurationSupport {

	/*@Override
	protected void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("welcome.htm", "welcome");

	}*/

	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp().prefix("/WEB-INF/view/").suffix(".jsp");
		
	}
	
}
