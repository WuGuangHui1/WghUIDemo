package com.myx.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MYXDemo extends LoginDemo{
//	新增公告
//	@Test(priority=1)
//	public void test1() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=公告列表");
//        webtest.click("link=新增");
//        webtest.type("xpath=//input[@name='title']","Baidu");
//        webtest.type("xpath=//input[@name='link']", "https://www.baidu.com/");
//        driver.switchTo().frame("ueditor_0");
//		webtest.click("xpath=//body[@class='view']");
//		webtest.type("xpath=//body[@class='view']", "你今天真好看");
//        driver.switchTo().defaultContent();
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//    	js.executeScript("scrollTo(0,10000)");
//    	webtest.click("xpath=//button[text()='确定']");
//    	webtest.alertAccept();
//	}
//	启动公告  value的值应该就是那个id
//	@Test(priority=2)
//	public void test2() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=公告列表");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='启用']");
//		webtest.alertAccept();
//	}
//	禁用公告
//	@Test(priority=3)
//	public void test3() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=公告列表");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='禁用']");
//		webtest.alertAccept();
//	}
//  删除公告
//	@Test(priority=4)
//	public void test4() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=公告列表");
//		webtest.click("xpath=//input[@value='1']");
//		webtest.click("xpath=//button[text()='删除']");
//		webtest.alertAccept();
//	}
//	添加友情链接  (记得改文件地址)
//	@Test(priority=5)
//	public void test5() throws InterruptedException {
//		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
//		webtest.click("link=友情链接");
//		webtest.click("link=新增");
//		webtest.type("xpath=//input[@name='title']", "title");
//		webtest.pause(2000);
//		webtest.type("xpath=//input[@name='link']", "https://www.baidu.com/");
//		webtest.pause(2000);
//		webtest.type("xpath=//input[@name='file']", "C:\\Users\\dell\\Desktop\\wjk.jpg");
//		webtest.pause(2000);
//		webtest.click("xpath=//form[@id='form']/div[2]/input[1]");
//		webtest.pause(2000);
//	}
//	启用友情链接
	@Test(priority=6)
	public void test6() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=友情链接");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='启用']");
		webtest.alertAccept();
	}
//	禁用友情链接
	@Test(priority=7)
	public void test7() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=友情链接");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='禁用']");
		webtest.alertAccept();
	}
//	删除友情链接
	@Test(priority=8)
	public void test8() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-laptop']");
		webtest.click("link=友情链接");
		webtest.click("xpath=//input[@value='6']");
		webtest.click("xpath=//button[text()='删除']");
		webtest.alertAccept();

	}
}
