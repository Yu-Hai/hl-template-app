package com.office.springboot.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * java读取配置文件
 * 
 * @author Neo 2017-5-12
 *
 */
public class PropertiesUtil {

	private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

	private static Properties context_egis_scms_app;

	private static final String PROPERTIES_EGIS_FILE_NAME = "application.properties";

	static {
		context_egis_scms_app = new Properties();
		InputStream scmsStream = null;
		try {
			scmsStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(PROPERTIES_EGIS_FILE_NAME);
			context_egis_scms_app.load(scmsStream);
			logger.trace("PropertiesUtil", "staitc init prop", context_egis_scms_app.toString());

		} catch (Exception e) {
		} finally {
			try {
				if (scmsStream != null) {
					scmsStream.close();
				}
			} catch (Exception e) {

			}
		}
	}

	public static String getProperty(String key) {
		String result = context_egis_scms_app.getProperty(key);
		return result;
	}

	public static String getProperty(String key, String defaultValue) {
		String result = context_egis_scms_app.getProperty(key, defaultValue);
		return result;
	}

	public static String getProperties(String propertiesName, String key) {
		Properties props = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesName);
			props.load(inputStream);
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (Exception e) {

			}
		}

		return props.getProperty(key);
	}
}