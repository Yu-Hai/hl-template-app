package com.office.springboot.common.constant;

/**
 * 相应状态码设置
 * 
 * @author Neo 2017-5-12
 *
 */
public class ResponseStatusCode {
	/** 正常返回 **/
	public static final String RESPONSE_OK = "200";
	/** 回话超时 **/
	public static final String SESSION_TIME_OUT = "50001";
	/** 权限校验失败 **/
	public static final String VALIDATE_FAIL_FLAG = "50002";
	/** 未知异常 **/
	public static final String UNKNOWN_ERROR_CODE = "50003";
	/** 入参校验失败 **/
	public static final String VALIDATE_PARAMS_FAIL = "50004";
	/** 系统错误，提示：系统繁忙，请稍后再试 **/
	public static final String RESPONSE_ERROR = "50005";

}
