/******************************************************************************
* Copyright (C) 2016 Personal LiQiao All Rights Reserved. 
* 未经本人正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
 
package com.liqiao.my.service;

import java.util.Map;
import com.liqiao.my.model.TUser;
import com.th.supcom.framework.mybatis.domain.PageBounds;
import com.th.supcom.framework.mybatis.domain.PageList;

/**
 * @title 本代码由Autocoding生成
 * @author  QiaoLi
 * @date    2019-01-04 14:06:17
 * @description:  
 * @log:    2019-01-04 14:06:17  QiaoLi  新建
 */
public interface TUserMapper {

	 
	public void insert(TUser tUser) ;
	 
	public void update(TUser tUser);
	 
	public TUser view(Integer id) ;
	 
	public int delete(Integer id);
	
	public PageList<TUser> getListWithPaging(TUser tUser, PageBounds pageBounds);
}
