//package com.example;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import com.example.config.BizConfig;
//
//public class CustomWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class<?>[] { BizConfig.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class<?>[] { BizConfig.class };
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
//	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		super.onStartup(servletContext);
//	}
//
//}
