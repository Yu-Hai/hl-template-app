package com.office.springboot.common.form;

import com.office.springboot.common.util.Bean2String;

public class BaseObjectForm extends CommonBaseForm{

	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return Bean2String.bean2String(this);
	}
	
}
