package com.office.springboot.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Session 管理工具
 * 
 * @author Administrator 2017-5-19
 */
public class SessionManagerUtils {
	
	/**
	 * 新增或者更新session
	 * @param request
	 * @param name
	 * @param value
	 * @return
	 */
	public static HttpSession addOrUpdateSessionInfo(HttpServletRequest request,String name,Object value){
		HttpSession session=request.getSession(true);
		session.setAttribute(name, value);
		return session;
	}
	
	/**
	 * 从session中取值
	 * @param request
	 * @param name
	 * @return
	 */
	public static Object getSessionValue(HttpServletRequest request,String name){
		return request.getSession(true).getAttribute(name);
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public static String getSessionId(HttpServletRequest request){
		return request.getSession().getId();
	}
}
