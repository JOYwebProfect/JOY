package com.joy.web.config;

import javax.servlet.Filter;

import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	  protected Class<?>[] getRootConfigClasses() {
	      return null;
	  }
	 
	  @Override
	  protected Class<?>[] getServletConfigClasses() {
	      return new Class<?>[] { WebConfig.class };
	  }
	 
	  @Override
	  protected String[] getServletMappings() {
	      return new String[] { "/" };
	  }
	 
	  @Override
	  protected Filter[] getServletFilters() {
	 
	      CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
	      characterEncodingFilter.setEncoding("UTF-8");
	       
	      return new Filter[] { characterEncodingFilter};
	       
	  }

}
