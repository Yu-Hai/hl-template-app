package com.office.springboot.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

/**
 * BaseDao
 * 
 * @author Neo 2017-5-23
 *
 */
@SuppressWarnings("rawtypes")
public interface BaseDao {
	/**
	 * 新增
	 * 
	 * @param obj
	 * @throws DataAccessException
	 */
	void addObject(Object obj) throws DataAccessException;

	/**
	 * 按主键ID删除记录
	 * 
	 * @param objId
	 * @return
	 * @throws DataAccessException
	 */
	int deleteObject(String objId) throws DataAccessException;

	/**
	 * 删除满足条件的所有记录
	 * 
	 * @param map
	 *            条件map
	 * @return
	 * @throws DataAccessException
	 */
	int deleteForMap(Map<String, Object> map) throws DataAccessException;

	/**
	 * 按主键ID进行查找
	 * 
	 * @param objId
	 *            主键ID
	 * @return
	 * @throws DataAccessException
	 */
	Object findObject(String objId) throws DataAccessException;

	/**
	 * 更新对象
	 * 
	 * @param obj
	 *            要更新的对象
	 * @return
	 * @throws DataAccessException
	 */
	int updateObject(Object obj) throws DataAccessException;

	/**
	 * 更改对象启用/停用状态
	 * 
	 * @param map
	 * @return
	 * @throws DataAccessException
	 */
	int updateObjectState(Map<String, Object> map) throws DataAccessException;

	/**
	 * 统计符合条件的记录的数目
	 * 
	 * @param filter
	 *            sql过滤语句
	 * @return
	 */
	int getObjectCount(String filter) throws DataAccessException;

	/**
	 * 统计符合条件的记录的数目
	 * 
	 * @param map
	 *            过滤条件map
	 * @return
	 */
	int getObjectCount(Map<String, Object> map) throws DataAccessException;

	/**
	 * 查找符合条件的对象
	 * 
	 * @param map
	 *            过滤条件map
	 * @return
	 */
	Object findObject(Map<String, Object> map) throws DataAccessException;

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
	List listByPage(Map<String, Object> map, int skipResults, int pageSize) throws DataAccessException;

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
	List listByPage(String filter, int skipResults, int pageSize) throws DataAccessException;

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
	List list(String filter) throws DataAccessException;

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
	List list(Map<String, Object> map) throws DataAccessException;

}