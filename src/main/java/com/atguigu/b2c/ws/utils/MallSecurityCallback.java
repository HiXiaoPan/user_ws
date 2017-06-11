package com.atguigu.b2c.ws.utils;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;





public class MallSecurityCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		// cxf 3.0版本后 wss4j 项目从 cxf 中独立出来了  org.apache.wss4j.common.ext.WSPasswordCallback;
		// 不是org.apache.ws.security.WSPasswordCallback;
		WSPasswordCallback callback = (WSPasswordCallback)callbacks[0];
		//获取请求中的访问 WebService 的用户名(这里暂时没用，若用户名密码保存到其他地方，可以通过用户名获取保存在ws端的密码。)
		String manager = callback.getIdentifier();
		String paw = SecurityConfig.getPswByUserName(manager);
		// 将密码设置到 callback 中，cxf 底层将自动根据 ws 端设置的代码与请求端传过来的密码进行比对。
		if(manager.equals("ljp")) {
			callback.setPassword(paw);
		}
		
	}

}
