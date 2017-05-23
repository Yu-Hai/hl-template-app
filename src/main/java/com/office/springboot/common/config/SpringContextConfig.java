package com.office.springboot.common.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
@SuppressWarnings("static-access")
public class SpringContextConfig implements ApplicationContextAware{
	
	private  static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context=arg0;
	}
	
	public static Object getBean(String beanName){
		return context.getBean(beanName);
	}

	public static ApplicationContext getApplicationContext(){
		return context;
	}
}
