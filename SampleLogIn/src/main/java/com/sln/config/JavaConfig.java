package com.sln.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JavaConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("javaConfig");
		return new Class<?>[] {MvcConfig.class};
		
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

}
