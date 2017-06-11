package com.atguigu.b2c.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.b2c.ws.mapper.T_MALL_USER_MAPPER;
import com.atguigu.b2c.ws.bean.T_MALL_ADDRESS;
import com.atguigu.b2c.ws.bean.T_MALL_USER;
import com.atguigu.b2c.ws.service.UserService;
import com.atguigu.b2c.ws.utils.DataSourceKeys;

public class UserServiceImpl implements UserService {
	@Autowired
	T_MALL_USER_MAPPER t_MALL_USER_MAPPER;
	
	@Override
	public T_MALL_USER login(T_MALL_USER user) {
		
		return t_MALL_USER_MAPPER.selectUserBypwdAndUname(user);
	}

	@Override
	public boolean regist() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update_user(T_MALL_USER user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T_MALL_ADDRESS> get_addr_by_user_id(T_MALL_USER get_addr_by_user_id) {
		// TODO Auto-generated method stub
		return t_MALL_USER_MAPPER.select_addr_by_user_id(get_addr_by_user_id.getId());
	}

	@Override
	public int add_addresses(List<T_MALL_ADDRESS> addresses) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update_addresses(T_MALL_ADDRESS address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDataSourceKey(String dataSourceKey) {
		DataSourceKeys.setDataSourceKey(dataSourceKey);
	}

}
