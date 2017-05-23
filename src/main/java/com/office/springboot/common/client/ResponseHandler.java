package com.office.springboot.common.client;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 * response utils
 * 
 * @author Neo 2017-5-12
 *
 */
public class ResponseHandler {

	private static Logger logger = Logger.getLogger(ResponseHandler.class);

	/**
	 * 响应内容
	 * @param object
	 * @param response
	 */
	public static void writeContent(Object object, HttpServletResponse response) {
		response.reset();
		// 将实体对象转换为JSON String转换
		String json = JSONObject.toJSONString(object);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		OutputStream out = null;
		try {
			out = response.getOutputStream();
			//out.write(json);
			out.write(json.getBytes());
			logger.debug("返回是\n");
			logger.debug(json);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.flush();
					out.close();
				} catch (Exception e) {
					
				}
			}
		}
	}
}
