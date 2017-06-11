package com.atguigu.b2c.ws.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyDataSourceRouting extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceKeys.getDataSourceKey();
	}

}
