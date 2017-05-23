package com.office.springboot.common.annotation.datasource;

/**
 * DB类型设置
 * 
 * @author Neo 2017-5-23
 *
 */
public class DynamicDataSourceHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/**
	 * 设置DB类型
	 * 
	 * @param String
	 */
	public static void setDataSourceType(String String) {
		contextHolder.set(String);
	}

	/**
	 * 获取DB类型
	 * 
	 * @return
	 */
	public static String getDataSourceType() {
		return (String) contextHolder.get();
	}

	/**
	 * 清除DB类型
	 */
	public static void clearDataSourceType() {
		contextHolder.remove();
	}

}