package com.webtest.demo;

import org.testng.annotations.Test;

public class DataViewDemo extends LoginDemo{
//	��Ϊ���޲��Դ򲻿������ҳ�ˡ�����
//	�鿴���ݸ���
	@Test(priority=1)
	public void test7() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-home']");
		webtest.click("link=���ݸ���");
	}
//	�����ݸ���������µ�ͳ��ͼ
	@Test(priority = 2)
	public void test8() throws InterruptedException {
//		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
//		webtest.click("link=���ݸ���");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.click("xpath=//a[@data-role='add-portlet']");
	}
//	ɾ��ͳ��ͼ
	@Test(priority=3)
	public void test9() throws InterruptedException {
	    webtest.click("xpath=//a[@data-role='delete-portlet']");
	}
//	ͨ�����ݸ����鿴��ǰ��������
	@Test(priority=4)   
	public void test10() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
		webtest.click("link=���ݸ���");
		webtest.click("link=�鿴�б�10�����ڷ����������Ϊ���ߣ�");
	}
//	�鿴���û���   ��������  
	@Test(priority=5)
	public void test11() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-home']");
		webtest.click("link=���ݸ���");
		webtest.click("xpath=//div[@class='dashboard-stat purple']/a");
	}

}
