package com.office.springboot.common.util;

import java.lang.reflect.Field;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * Java Bean to String Utils
 * 
 * @author Neo
 * 
 *         2017-4-28
 *
 */
@SuppressWarnings("rawtypes")
public class Bean2String {

	/**
	 * Bean to String method
	 * 
	 * @param bean
	 * @return
	 */
	public static String bean2String(Object bean) {
		StringBuffer result = new StringBuffer();
		if (null == bean) {
			return "this bean is null, can't get fields form this object !";
		}
		if (bean instanceof String) {
			return bean.toString();
		}
		result.append(bean.getClass().getName()).append(": [");
		Class clazz = bean.getClass();
		BeanWrapper wrapper = new BeanWrapperImpl(bean);
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			try {
				Object fieldValue = wrapper.getPropertyValue(field.getName());
				if (null != fieldValue) {
					fieldValue = fieldValue.toString();
				}
				result.append(" ").append(field.getName()).append("=").append(fieldValue).append(",");
			} catch (Exception e) {
			}
		}
		result.replace(result.length() - 1, result.length(), " ]");
		return result.toString();
	}

}