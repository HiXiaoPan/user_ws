package com.atguigu.b2c.ws.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class SecurityConfig {
	public static String getPswByUserName(String userName) {
		 Properties pro = new Properties();
		 InputStream inputStream = SecurityConfig.class.getClassLoader().getResourceAsStream("security.properties");
		 try {
			pro.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return  pro.getProperty(userName);
	}
}
