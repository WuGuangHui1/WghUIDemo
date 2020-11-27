package com.webtest.demo;

import org.testng.annotations.Test;

public class DashBoardDemo extends LoginDemo{
//	仪表盘图标设置   
	@Test(priority=3)
	public void test3() throws InterruptedException {
//		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
//	    webtest.click("link=仪表盘");
	    webtest.mouseToElement("xpath=//div[@class='tile-box']");
	    webtest.click("class=icon-settings");
	    webtest.click("xpath=//a[@class='icon-selector']");
	    webtest.click("xpath=//span[@class='icon-diamond']");
	    webtest.click("xpath=//button[@data-role='saveTileSetting']");
	}
//	改变仪表盘背景色     
	@Test(priority=4)
	public void test4() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=仪表盘");
//		webtest.pause(2000);
	    webtest.mouseToElement("xpath=//div[@class='tile-box']");
	    webtest.click("class=icon-settings");
	    webtest.click("xpath=//div[@title='选择图标背景色']");
	    webtest.click("id=00ff33");
	    webtest.click("xpath=//button[@data-role='saveTileSetting']");
	}
//	通过仪表盘进入到身份访问权限管理界面
	@Test(priority=5)
	public void test5() throws InterruptedException {
	    webtest.click("id=tile_2");
	}
//	删除仪表盘      ！！！删除之后再添加id会发生变化
	@Test(priority=6) 
	public void test6() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=仪表盘");
	    webtest.mouseToElement("id=tile_12");
	    webtest.click("xpath=//a[@data-id='12']");
	    webtest.alertAccept();
	}

}
