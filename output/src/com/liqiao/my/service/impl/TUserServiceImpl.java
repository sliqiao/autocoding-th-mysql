/******************************************************************************
* Copyright (C) 2016 Personal LiQiao All Rights Reserved. 
* 未经本人正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
 
package com.liqiao.my.service.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liqiao.my.model.TUser;
import com.liqiao.my.service.TUserService;

/**
 * @title 本代码由Autocoding生成
 * @author  QiaoLi
 * @date    2019-01-09 14:09:40
 * @description:  
 * @log:    2019-01-09 14:09:40  QiaoLi  新建
 */
public class TUserServiceImpl implements TUserService{
 
	private static final Logger LOGGER = LoggerFactory.getLogger(TUserServiceImpl.class);
	 
	@Override
	public int delete(Integer id) {
		LOGGER.info("执行方法TUserServiceImpl.delete()： id=>" + id);
		return 1;
	}
	
	@Override
	public int delete(Integer[] id_array) {
        LOGGER.info("执行方法TUserServiceImpl.delete()： id_array=>" + id_array);
        for (String id : id_array) {
            LOGGER.info(" id_array=>" + id_array);
            this.delete(id);
        }
        return id_array.length;
    }

	@Override
	public TUser insert(TUser tUser) {
		LOGGER.info("执行方法TUserServiceImpl.insert()： tUser=>" + tUser);
		return tUser;
	}

	@Override
	public TUser update(TUser tUser) {
		LOGGER.info("执行方法TUserServiceImpl.update()： tUser=>" + tUser);
		return tUser;
	}
 
	@Override
	public TUser view(Integer id) {
		LOGGER.info("执行TUserServiceImpl.view()： id=>" + id);
		return null;
	}

}
