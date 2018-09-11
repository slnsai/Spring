package com.sln.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.sln.config")
public class MvcConfig extends WebMvcConfigurationSupport{

	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("mvcConfig");
		registry.jsp().prefix("/WEN-INF/view/").suffix(".jsp");
	}

	
}
