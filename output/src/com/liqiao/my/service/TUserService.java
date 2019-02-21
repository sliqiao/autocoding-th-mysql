/******************************************************************************
* Copyright (C) 2016 Personal LiQiao All Rights Reserved. 
* 未经本人正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
 
package com.liqiao.my.service;

import java.util.Map;

import com.liqiao.my.model.TUser;
import com.autocoding.common.page.PageInfo;
import com.autocoding.common.page.PageList;

/**
 * @title 本代码由Autocoding生成
 * @author  QiaoLi
 * @date    2019-01-09 14:09:40
 * @description:  
 * @log:    2019-01-09 14:09:40  QiaoLi  新建
 */
public interface TUserService {
 
	
	/**
	 * 新增
	 * @param tUser 查询对象
	 * @return 新增后的对象
	 */
	public TUser insert(TUser tUser) ;
	
	/**
	 * 修改
	 * @param tUser 修改对象
	 * @return 更新后的对象
	 */
	public void update(TUser tUser);
	
	/**
	 * 查看
	 * @param id 主键
	 * @return 查询对象
	 */
	public TUser view(Integer id) ;
	
	/**
	 * 批量删除
	 * @param id_array 批量删除对象
	 * @return 删除结果数量
	 */
	public int delete(Integer[] id_array);
	
	/**
	 * 删除
	 * @param id 主键
	 * @return 删除结果数量
	 */
	public int delete(Integer id);
}
