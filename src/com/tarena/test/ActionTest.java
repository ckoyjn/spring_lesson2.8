package com.tarena.test;

import com.tarena.biz.IUserServ;
import com.tarena.biz.impl.UserServImpl;
import com.tarena.biz.impl.UserServProxyImpl;

public class ActionTest {
	public static void main(String[] args) {
		//�û����ʴ������---��Ϣ->Ŀ�����
		IUserServ iuserServ = new UserServProxyImpl(new UserServImpl());
		iuserServ.findAllUser();
	}
}
