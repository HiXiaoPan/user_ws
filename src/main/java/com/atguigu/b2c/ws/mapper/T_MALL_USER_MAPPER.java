package com.atguigu.b2c.ws.mapper;

import java.util.List;

import com.atguigu.b2c.ws.bean.T_MALL_ADDRESS;
import com.atguigu.b2c.ws.bean.T_MALL_USER;

public interface T_MALL_USER_MAPPER {

	T_MALL_USER selectUserBypwdAndUname(T_MALL_USER user);

	List<T_MALL_ADDRESS> select_addr_by_user_id(Integer id);

}
