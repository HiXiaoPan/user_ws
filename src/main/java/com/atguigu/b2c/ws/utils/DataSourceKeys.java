package com.atguigu.b2c.ws.utils;

public class DataSourceKeys {
	private static ThreadLocal<String> keepKeys = new ThreadLocal<>();
	public static void setDataSourceKey(String dataSourceKey) {
		keepKeys.set(dataSourceKey);
	}
	public static String getDataSourceKey() {
		return keepKeys.get();
	}
}
