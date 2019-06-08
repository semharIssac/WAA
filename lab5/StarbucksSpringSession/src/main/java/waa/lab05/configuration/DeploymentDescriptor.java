package waa.lab05.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import waa.lab05.configuration.Dispatcher;

public class DeploymentDescriptor extends AbstractAnnotationConfigDispatcherServletInitializer {
	  
	protected Class<?>[] getServletConfigClasses()  {
	    return new Class[] {Dispatcher.class};
	}
	
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}
	
	protected Class<?>[] getRootConfigClasses() {
	    return null;
	}
	
 }