package com.office.springboot.common.exception;

public class BusinessException extends BaseException {

	private static final long serialVersionUID = 8566572900818858358L;

	public BusinessException(String returnFlag, String returnMsg) {
		super(returnFlag, returnMsg);
	}

	public BusinessException(String returnMsg) {
		super(returnMsg);
	}

	public BusinessException(Throwable cause, String returnFlag, String returnMsg, String traceId) {
		super(cause, returnFlag, returnMsg, traceId);
	}

	public BusinessException(Throwable cause, String returnFlag, String returnMsg) {
		super(cause, returnFlag, returnMsg);
	}

	public BusinessException(Throwable cause, String returnMsg) {
		super(cause, returnMsg);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

}