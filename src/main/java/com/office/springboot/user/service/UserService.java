package com.office.springboot.user.service;

import com.office.springboot.common.exception.BusinessException;
import com.office.springboot.common.service.BaseService;
import com.office.springboot.user.dto.UserDTO;

/**
 * 用户模块 service interface
 * 
 * @author Neo 2017-5-12
 */
public interface UserService extends BaseService {

	UserDTO getUserInfo(UserDTO user) throws BusinessException;

	String insertUserWithBackId(UserDTO user) throws BusinessException;
}
