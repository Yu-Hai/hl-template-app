package com.office.springboot.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化工具
 * 
 * @author Neo 2017-5-12
 *
 */
public class DateFormatUtils {

	public static final String FORMAT_YYYYMMDD = "yyyyMMdd";
	public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

	public static String formatDate(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static void main(String[] args) {
		System.out.println(formatDate(new Date(), DateFormatUtils.FORMAT_YYYYMMDDHHMMSS));
	}
}
