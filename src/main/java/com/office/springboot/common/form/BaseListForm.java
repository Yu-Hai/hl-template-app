package com.office.springboot.common.form;

import java.util.List;

@SuppressWarnings("rawtypes")
public class BaseListForm extends CommonBaseForm {
	private List dataList;

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

}
