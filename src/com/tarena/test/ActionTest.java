package com.tarena.test;

import com.tarena.biz.IUserServ;
import com.tarena.biz.impl.UserServImpl;
import com.tarena.biz.impl.UserServProxyImpl;

public class ActionTest {
	public static void main(String[] args) {
		//用户访问代理对象---信息->目标对象
		IUserServ iuserServ = new UserServProxyImpl(new UserServImpl());
		iuserServ.findAllUser();
	}
}
