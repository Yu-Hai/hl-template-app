package com.office.springboot.common.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.office.springboot.common.client.ResponseHandler;
import com.office.springboot.common.constant.CommonConstant;
import com.office.springboot.common.constant.ResponseStatusCode;

/**
 * 异常拦截器
 * @author Neo
 * 2017-5-12
 *
 */
public class ExceptionInterfaceIntercept extends HandlerInterceptorAdapter implements InitializingBean {
	private static Logger logger = LoggerFactory.getLogger(ExceptionInterfaceIntercept.class);

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		if (ex != null) {
			logger.error("拦截异常：" + ex.getMessage());
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("returnFlag", ResponseStatusCode.RESPONSE_ERROR);
			map.put("returnMsg", CommonConstant.SYSTEM_ERR_MSG);
			ResponseHandler.writeContent(map, response);
		}
		super.afterCompletion(request, response, handler, ex);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

}