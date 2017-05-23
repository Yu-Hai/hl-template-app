package com.office.springboot.user.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.springboot.common.constant.CommonConstant.Prefix;
import com.office.springboot.common.constant.CommonConstant.TableSeqName;
import com.office.springboot.common.dao.CommonDao;
import com.office.springboot.common.exception.BusinessException;
import com.office.springboot.common.service.impl.BaseServiceImpl;
import com.office.springboot.common.util.DateFormatUtils;
import com.office.springboot.user.dao.UserDao;
import com.office.springboot.user.dto.UserDTO;
import com.office.springboot.user.service.UserService;

/**
 * 用户模块 service
 * 
 * @author Neo 2017-5-12
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements UserService {
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Autowired
	private CommonDao commonMapper;

	@Override
	public UserDTO getUserInfo(UserDTO user) throws BusinessException {
		try {
			return userDao.getUserInfo(user);
		} catch (Exception e) {
			logger.error("获取用户【失败】");
			throw new BusinessException(e);
		}
	}

	@Override
	public String insertUserWithBackId(UserDTO user) throws BusinessException {
		try {
			Integer seq = commonMapper.getSeqByName(TableSeqName.T_USER_SEQ);
			StringBuffer idUser = new StringBuffer();
			idUser.append(Prefix.USER_ID)
					.append(DateFormatUtils.formatDate(new Date(), DateFormatUtils.FORMAT_YYYYMMDD))
					.append(String.format("%08d", seq));
			user.setIdUser(idUser.toString());
			logger.trace("新增用户：" + user.toString());
			userDao.insertUser(user);
			logger.trace("新增用户成功");
			return idUser.toString();
		} catch (Exception e) {
			logger.error("新增用户【失败】" + user.toString());
			throw new BusinessException(e);
		}
	}

}
