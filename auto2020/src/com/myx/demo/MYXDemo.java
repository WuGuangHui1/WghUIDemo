package com.myx.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MYXDemo extends LoginDemo{
//	��������
//	@Test(priority=1)
//	public void test1() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=�����б�");
//        webtest.click("link=����");
//        webtest.type("xpath=//input[@name='title']","Baidu");
//        webtest.type("xpath=//input[@name='link']", "https://www.baidu.com/");
//        driver.switchTo().frame("ueditor_0");
//		webtest.click("xpath=//body[@class='view']");
//		webtest.type("xpath=//body[@class='view']", "�������ÿ�");
//        driver.switchTo().defaultContent();
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//    	js.executeScript("scrollTo(0,10000)");
//    	webtest.click("xpath=//button[text()='ȷ��']");
//    	webtest.alertAccept();
//	}
//	��������  value��ֵӦ�þ����Ǹ�id
//	@Test(priority=2)
//	public void test2() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=�����б�");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='����']");
//		webtest.alertAccept();
//	}
//	���ù���
//	@Test(priority=3)
//	public void test3() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=�����б�");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='����']");
//		webtest.alertAccept();
//	}
//  ɾ������
//	@Test(priority=4)
//	public void test4() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=�����б�");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='ɾ��']");
//		webtest.alertAccept();
//	}
//	�����������  (�ǵø��ļ���ַ)
//	@Test(priority=5)
//	public void test5() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=��������");
//		webtest.click("link=����");
//		webtest.type("xpath=//input[@name='title']", "title");
//		webtest.pause(2000);
//		webtest.type("xpath=//input[@name='link']", "https://www.baidu.com/");
//		webtest.pause(2000);
//		webtest.type("xpath=//input[@name='file']", "C:\\Users\\dell\\Desktop\\wjk.jpg");
//		webtest.pause(2000);
//		webtest.click("xpath=//form[@id='form']/div[2]/input[1]");
//		webtest.pause(2000);
//	}
//	������������
	@Test(priority=6)
	public void test6() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=��������");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='����']");
		webtest.alertAccept();
	}
//	������������
	@Test(priority=7)
	public void test7() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=��������");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='����']");
		webtest.alertAccept();
	}
//	ɾ����������
	@Test(priority=8)
	public void test8() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=��������");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='ɾ��']");
		webtest.alertAccept();

	}
}
