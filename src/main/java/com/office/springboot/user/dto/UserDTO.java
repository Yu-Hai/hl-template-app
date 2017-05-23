package com.office.springboot.user.dto;

import com.office.springboot.common.form.CommonBaseForm;
import com.office.springboot.common.util.Bean2String;

/**
 * 用户DTO
 * 
 * @author Neo 2017-5-12
 *
 */
public class UserDTO extends CommonBaseForm {

	private String idUser;

	private String userName;

	private String password;

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return Bean2String.bean2String(this);
	}
	
	

}
