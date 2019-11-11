package com.user.javahater.springdemo.demo.config;

import
org.springframework.web.servlet.support.AbstractAnnot ationConfigDispatcherServletInitializer;
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected Class<?>[] getRootConfigClasses() { // TODO Auto-generated method stub return null;
}
@Override
protected Class<?>[] getServletConfigClasses() return new Class[] { AppConfig.class };
@Override
protected String[] getServletMappings() { return new String[] { "/" };
} }
