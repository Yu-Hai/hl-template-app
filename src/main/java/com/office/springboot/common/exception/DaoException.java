package com.office.springboot.common.exception;

public class DaoException extends BaseException {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 1L;

	public DaoException(String returnMsg) {
		super(returnMsg);
	}

	public DaoException(String returnFlag, String returnMsg) {
		super(returnFlag, returnMsg);
	}

	public DaoException(Throwable cause, String returnFlag, String returnMsg, String traceId) {
		super(cause, returnFlag, returnMsg, traceId);
	}

	public DaoException(Throwable cause, String returnFlag, String returnMsg) {
		super(cause, returnFlag, returnMsg);
	}

	public DaoException(Throwable cause, String returnMsg) {
		super(cause, returnMsg);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

}