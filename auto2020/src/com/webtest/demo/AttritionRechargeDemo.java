package com.webtest.demo;

import org.testng.annotations.Test;

public class AttritionRechargeDemo extends LoginDemo{
//	�鿴�û���ʧ��ͳ��ͼ
	@Test(priority=1)
	public void test15() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=��ʧ��ͳ��");
	    webtest.pause(2000);
	}
//	�鿴��ֵ�û�ͳ��
	@Test(priority=2)
	public void test22() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=��ֵ�û�ͳ��");
	}
}
