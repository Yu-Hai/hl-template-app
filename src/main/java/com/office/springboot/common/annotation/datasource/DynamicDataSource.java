package com.office.springboot.common.annotation.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源 实现spring 类方法AbstractRoutingDataSource.determineCurrentLookupKey
 * 以更新数据源bean
 * 
 * @author Administrator
 * 
 *         2017-5-23
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	public final static String DEFAULT_DB = "defaultDB";
	public final static String LOCAL_DB = "localDB";

	@Override
	protected Object determineCurrentLookupKey() {
		// 从自定义的位置获取数据源标识
		return DynamicDataSourceHolder.getDataSourceType();
	}

}