package com.office.springboot.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.office.springboot.common.interceptor.ExceptionInterfaceIntercept;
import com.office.springboot.common.interceptor.LoginInterfaceInterceptor;

/**
 * 拦截器配置类
 * 
 * @author Neo 2017-5-12
 *
 */
@SuppressWarnings("deprecation")
@Configuration
public class InterceptorsConfig extends WebMvcConfigurerAdapter {
	
    @Bean
    public LoginInterfaceInterceptor loginInterfaceInterceptor() {
        return new LoginInterfaceInterceptor();
    }
    
    @Bean
    public ExceptionInterfaceIntercept exceptionInterfaceIntercept(){
    	return new ExceptionInterfaceIntercept();
    }

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(new LoginInterfaceInterceptor()); //这种方式配置的拦截其中无法注入对象
		registry.addInterceptor(loginInterfaceInterceptor());		//这种方式配置的可以注入对象
		registry.addInterceptor(exceptionInterfaceIntercept());
		super.addInterceptors(registry);
	}
}
