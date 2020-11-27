package com.webtest.demo;

import org.testng.annotations.Test;

public class DataViewDemo extends LoginDemo{
//	因为极限测试打不开这个网页了。。。
//	查看数据概览
	@Test(priority=1)
	public void test7() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-home']");
		webtest.click("link=数据概览");
	}
//	在数据概览中添加新的统计图
	@Test(priority = 2)
	public void test8() throws InterruptedException {
//		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
//		webtest.click("link=数据概览");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.click("xpath=//a[@data-role='add-portlet']");
	}
//	删除统计图
	@Test(priority=3)
	public void test9() throws InterruptedException {
	    webtest.click("xpath=//a[@data-role='delete-portlet']");
	}
//	通过数据概览查看当前在线人数
	@Test(priority=4)   
	public void test10() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
		webtest.click("link=数据概览");
		webtest.click("link=查看列表（10分钟内发起过请求视为在线）");
	}
//	查看总用户数   ？？？？  
	@Test(priority=5)
	public void test11() throws InterruptedException {
		webtest.mouseToElement("xpath=//i[@class='icon-home']");
		webtest.click("link=数据概览");
		webtest.click("xpath=//div[@class='dashboard-stat purple']/a");
	}

}
