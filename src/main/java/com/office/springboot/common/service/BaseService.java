package com.office.springboot.common.service;

import java.util.List;
import java.util.Map;

import com.office.springboot.common.exception.BusinessException;

/**
 * BaseService
 * 
 * @author Neo
 * 
 * @param <T>
 *            2017-5-23
 */
@SuppressWarnings("rawtypes")
public interface BaseService {

	/**
	 * 新增
	 * 
	 * @param obj
	 * @throws BusinessException
	 */
	void addObject(Object obj) throws BusinessException;

	/**
	 * 按主键ID删除记录
	 * 
	 * @param objId
	 * @return
	 * @throws BusinessException
	 */
	int deleteObject(String objId) throws BusinessException;

	/**
	 * 删除满足条件的所有记录
	 * 
	 * @param map
	 *            条件map
	 * @return
	 * @throws BusinessException
	 */
	int deleteForMap(Map<String, Object> map) throws BusinessException;

	/**
	 * 按主键ID进行查找
	 * 
	 * @param objId
	 *            主键ID
	 * @return
	 * @throws BusinessException
	 */
	Object findObject(String objId) throws BusinessException;

	/**
	 * 更新对象
	 * 
	 * @param obj
	 *            要更新的对象
	 * @return
	 * @throws BusinessException
	 */
	int updateObject(Object obj) throws BusinessException;

	/**
	 * 更改对象启用/停用状态
	 * 
	 * @param map
	 * @return
	 * @throws BusinessException
	 */
	int updateObjectState(Map<String, Object> map) throws BusinessException;

	/**
	 * 统计符合条件的记录的数目
	 * 
	 * @param filter
	 *            sql过滤语句
	 * @return
	 */
	int getObjectCount(String filter) throws BusinessException;

	/**
	 * 统计符合条件的记录的数目
	 * 
	 * @param map
	 *            过滤条件map
	 * @return
	 */
	int getObjectCount(Map<String, Object> map) throws BusinessException;

	/**
	 * 查找符合条件的对象
	 * 
	 * @param map
	 *            过滤条件map
	 * @return
	 */
	Object findObject(Map<String, Object> map) throws BusinessException;

	/**
	 * 分页查询满足给定条件的对象列表
	 * 
	 * @param map
	 *            过滤条件map
	 * @param skipResults
	 *            跳过的记录
	 * @param pageSize
	 *            一页的记录条数
	 * @return
	 */
	List listByPage(Map<String, Object> map, int skipResults, int pageSize) throws BusinessException;

	/**
	 * 分页查询满足给定条件的对象列表
	 * 
	 * @param filter
	 *            sql过滤语句
	 * @param skipResults
	 *            跳过的记录
	 * @param pageSize
	 *            一页的记录条数
	 * @return
	 */
	List listByPage(String filter, int skipResults, int pageSize) throws BusinessException;

	/**
	 * 查询所有满足给定条件的对象列表
	 * 
	 * @param filter
	 *            sql过滤语句
	 * @param skipResults
	 *            跳过的记录
	 * @param pageSize
	 *            一页的记录条数
	 * @return
	 */
	List list(String filter) throws BusinessException;

	/**
	 * 查询所有满足给定条件的对象列表
	 * 
	 * @param map
	 *            过滤条件map
	 * @param skipResults
	 *            跳过的记录
	 * @param pageSize
	 *            一页的记录条数
	 * @return
	 */
	List list(Map<String, Object> map) throws BusinessException;

}
