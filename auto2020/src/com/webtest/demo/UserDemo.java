package com.webtest.demo;

import org.testng.annotations.Test;

public class UserDemo extends LoginDemo{
//	ɾ���û�
	@Test(priority=1)
	public void test31() {
		webtest.click("xpath=//a[@title='�û�����']");
        webtest.click("xpath=//input[@value='108']");
        webtest.click("xpath=//button[contains(text(),'ɾ��')]");
        webtest.alertAccept();
        webtest.alertAccept();
	}
//	�޸������׺
	@Test(priority=2)
	public void test32() {
		webtest.click("xpath=//a[@title='�û�����']");
		webtest.click("xpath=//input[@value='109']");
		webtest.click("xpath=//button[contains(text(),'�޸ĵ�������¼�����׺')]");
		webtest.alertAccept();
	}
//	�����û�
	@Test(priority=3)
	public void test33() {
		webtest.click("id=seek");
		webtest.click("xpath=//option[@value='2']");
		webtest.typeAndClear("xpath=//input[@name='nickname']","wgh123");
		webtest.click("id=search");
	}
	

}
