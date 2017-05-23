package com.office.springboot.user.dao;

import com.office.springboot.common.dao.BaseDao;
import com.office.springboot.common.exception.DaoException;
import com.office.springboot.user.dto.UserDTO;

/**
 * 用户模块 sql mapper
 * 
 * @author Neo
 *
 */
 
public interface UserDao extends BaseDao{

	/**
	 * 通过用户信息查询用户
	 * 
	 * @param user
	 * @return
	 */
	UserDTO getUserInfo(UserDTO user) throws DaoException;

	/**
	 * 插入用户信息
	 * 
	 * @param user
	 */
	void insertUser(UserDTO user) throws DaoException;

}
