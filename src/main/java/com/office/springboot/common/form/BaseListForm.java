package com.office.springboot.common.form;

import java.util.List;

import com.office.springboot.common.util.Bean2String;

@SuppressWarnings("rawtypes")
public class BaseListForm extends CommonBaseForm {
	private List dataList;

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return Bean2String.bean2String(this);
	}
}
