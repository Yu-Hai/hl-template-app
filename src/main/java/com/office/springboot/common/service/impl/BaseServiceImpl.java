package com.office.springboot.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.springboot.common.dao.BaseDao;
import com.office.springboot.common.exception.BusinessException;
import com.office.springboot.common.service.BaseService;

/**
 * BaseServiceImpl
 * 
 * @author Neo
 *
 * @param <T>
 *            2017-5-23
 */
@Service
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BaseServiceImpl implements BaseService {

	@Autowired
	private BaseDao baseDao;

	@Override
	public void addObject(Object obj) throws BusinessException {
		baseDao.addObject(obj);
	}

	@Override
	public int deleteObject(String objId) throws BusinessException {
		return baseDao.deleteObject(objId);
	}

	@Override
	public int deleteForMap(Map map) throws BusinessException {
		return baseDao.deleteForMap(map);
	}

	@Override
	public Object findObject(String objId) throws BusinessException {
		return baseDao.findObject(objId);
	}

	@Override
	public int updateObject(Object obj) throws BusinessException {
		return baseDao.updateObject(obj);
	}

	@Override
	public int updateObjectState(Map map) throws BusinessException {
		return baseDao.updateObjectState(map);
	}

	@Override
	public int getObjectCount(String filter) throws BusinessException {
		return baseDao.getObjectCount(filter);
	}

	@Override
	public int getObjectCount(Map map) throws BusinessException {
		return baseDao.getObjectCount(map);
	}

	@Override
	public Object findObject(Map map) throws BusinessException {
		return baseDao.findObject(map);
	}

	@Override
	public List listByPage(Map map, int skipResults, int pageSize) throws BusinessException {
		return baseDao.listByPage(map, skipResults, pageSize);
	}

	@Override
	public List listByPage(String filter, int skipResults, int pageSize) throws BusinessException {
		return baseDao.listByPage(filter, skipResults, pageSize);
	}

	@Override
	public List list(String filter) throws BusinessException {
		return baseDao.list(filter);
	}

	@Override
	public List list(Map map) throws BusinessException {
		return baseDao.list(map);
	}

}
