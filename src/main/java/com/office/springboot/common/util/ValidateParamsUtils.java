package com.office.springboot.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.office.springboot.user.dto.UserDTO;

/**
 * 参数校验工具
 * 
 * @author Administrator 2017-5-19
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ValidateParamsUtils {

	/**
	 * 检查Map格式的参数
	 * 
	 * @param params
	 * @param paramNames
	 * @return
	 */
	public static String checkParams(Map params, String... paramNames) {
		if (paramNames == null || paramNames.length == 0) {
			return null;
		}
		if (params == null || params.isEmpty()) {
			return "缺少必要的入参:" + Arrays.toString(paramNames);
		}
		Object temp;
		List errors = new ArrayList();
		for (String paramName : paramNames) {
			if (StringUtils.isBlank(paramName)) {
				continue;
			}
			temp = params.get(paramName);
			if (temp == null || StringUtils.isBlank(temp.toString())) {
				errors.add(paramName);
			}
		}
		return errors.isEmpty() ? null : "缺少必要的入参:" + errors.toString();
	}

	/**
	 * 检查对象格式的入参
	 * 
	 * @param param
	 * @param paramNames
	 * @return
	 */
	public static String checkParams(Object param, String... paramNames) {
		if (paramNames == null || paramNames.length == 0) {
			return null;
		}
		if (param == null) {
			return "缺少必要的入参" + Arrays.toString(paramNames);
		}
		List errors = new ArrayList();
		for (String paramName : paramNames) {
			if (StringUtils.isBlank(paramName)) {
				continue;
			}
			Object temp = null;
			try {
				String methodName = "get" + paramName.substring(0, 1).toUpperCase() + paramName.substring(1);
				Method m = param.getClass().getMethod(methodName, null);
				temp = m.invoke(param, null);
			} catch (Exception e) {
			}
			if (temp == null || StringUtils.isBlank(temp.toString())) {
				errors.add(paramName);
			}
		}
		return errors.isEmpty() ? null : "缺少必要的入参:" + errors.toString();
	}

	public static void main(String[] args) {
		UserDTO param = new UserDTO();
		param.setIdUser("aaa");
		param.setUserName("bbb");
		String result = checkParams(param, "aa", "userName");
		System.out.println(result);
	}

}
