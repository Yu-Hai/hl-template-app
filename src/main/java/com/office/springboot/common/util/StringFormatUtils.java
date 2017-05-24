package com.office.springboot.common.util;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class StringFormatUtils {
	
	public static Map<String, Object> formatParam(String template,String...strings){
		Map<String, Object> result=new HashMap<String, Object>();
		
		String param="{";
		param+=MessageFormat.format(template, strings);
		param+="}";
		System.out.println(param);
		result=JSONObject.parseObject(param);
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		String template="userName:{0},password:{1}";
		formatParam(template, "admin","root");
		
		
	}

}
