package com.webtest.demo;

import org.testng.annotations.Test;

public class ActiveUserDemo extends LoginDemo{
//	�鿴��Ծ�û��������Ϣ
	@Test(priority=1)
	public void test16() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=��Ծ�û�ͳ��");
	}
//  ��Ծ�û�ͳ��֮ʱ��ѡ��
	@Test(priority=2)
	public void test17() {
		webtest.click("id=reservation");
		webtest.click("xpath=//div[@class='calendar second left']/div/table/tbody/tr[3]/td[6]");
		webtest.click("xpath=//div[@class='calendar first right']/div/table/tbody/tr[4]/td[7]");
		webtest.click("xpath=//button[contains(text(),'ȷ��')]");
	}
//	��Ծ�û�ͳ��֮��ͬʱ�����
	@Test(priority=3)
	public void test18() {
		webtest.click("xpath=//input[@value='week']");
	
	}

}
