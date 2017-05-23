package com.office.springboot.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

import com.office.springboot.common.constant.ResponseStatusCode;

/**
 * 自定义异常基础类
 * 
 * @author Neo 2017-5-1
 *
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -434104233779192938L;

	private Throwable cause;// 异常
	private String returnFlag;// 错误code
	private String traceId;// 追踪id

	public BaseException(String returnMsg) {
		this("", returnMsg);
	}

	public BaseException(Throwable cause) {
		this(cause, "");
	}

	public BaseException(String returnFlag, String returnMsg) {
		this(null, returnFlag, returnMsg);
	}

	public BaseException(Throwable cause, String returnMsg) {
		this(cause, ResponseStatusCode.UNKNOWN_ERROR_CODE, returnMsg);
	}

	public BaseException(Throwable cause, String returnFlag, String returnMsg) {
		this(cause, returnFlag, returnMsg, null);
	}

	public BaseException(Throwable cause, String returnFlag, String returnMsg, String traceId) {
		super(returnMsg);
		this.cause = cause;
		this.returnFlag = returnFlag;
		this.traceId = traceId;
	}

	public void printStackTrace() {
		this.printStackTrace(System.err);
	}

	public void printStackTrace(PrintStream ps) {
		if (null == getCause()) {
			super.printStackTrace(ps);
		} else {
			ps.println(this);
			getCause().printStackTrace(ps);
		}
	}

	public void printStackTrace(PrintWriter pw) {
		if (null == getCause()) {
			super.printStackTrace(pw);
		} else {
			pw.println(this);
			getCause().printStackTrace(pw);
		}
	}

	public Throwable getCause() {
		return this.cause == this ? null : this.cause;
	}

	public String getMessage() {
		if (getCause() == null) {
			return super.getMessage();
		}
		return super.getMessage() + getCause().getMessage();
	}

	public String getreturnFlag() {
		return returnFlag;
	}

	public String getTraceId() {
		return traceId;
	}

}