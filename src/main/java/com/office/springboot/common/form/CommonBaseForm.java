package com.office.springboot.common.form;

import com.office.springboot.common.constant.CommonConstant.ResponseStatus;
import com.office.springboot.common.constant.ResponseStatusCode;

/**
 * 公共的返回Form
 * 
 * @author Neo 2017-5-12
 */
public class CommonBaseForm extends BaseForm {
	private String status = "00";
	private String returnFlag = ResponseStatus.SUCCESS.status();
	private String returnMsg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReturnFlag() {
		return returnFlag;
	}

	public void setReturnFlag(String flag) {
		this.returnFlag = flag;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setMsg(String msg) {
		this.returnMsg = msg;
	}

	public void setTimeOutForm() {
		setForm(ResponseStatus.TIMEOUT.status(), ResponseStatus.TIMEOUT.msg());
	}

	public void setLoginFailForm() {
		setForm(ResponseStatus.TIMEOUT.status(), ResponseStatus.TIMEOUT.msg());
	}

	public void setErrorForm() {
		setForm(ResponseStatus.ERROR.status(), ResponseStatus.ERROR.msg());
	}

	public void setErrorForm(String msg) {
		setForm(ResponseStatus.ERROR.status(), msg);
	}

	public void setSuccessForm(String msg) {
		setForm(ResponseStatus.SUCCESS.status(), msg);
	}

	public void setFailForm(String msg) {
		setForm(ResponseStatus.FAIL.status(), msg);
	}

	public void setForm(String status, String msg) {
		this.returnFlag = status;
		if (!ResponseStatus.SUCCESS.status().equals(status)) {
			this.status = status;
		}
		this.returnMsg = msg;
	}

	/**
	 * 缺少必要的入参
	 */
	public void setValidateFailForm() {
		this.returnFlag = ResponseStatusCode.VALIDATE_PARAMS_FAIL;
		this.returnMsg = "缺少必要的入参";
	}

}