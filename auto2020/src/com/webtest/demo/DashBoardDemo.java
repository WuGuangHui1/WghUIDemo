package com.webtest.demo;

import org.testng.annotations.Test;

public class DashBoardDemo extends LoginDemo{
//	�Ǳ���ͼ������   
	@Test(priority=3)
	public void test3() throws InterruptedException {
//		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
//	    webtest.click("link=�Ǳ���");
	    webtest.mouseToElement("xpath=//div[@class='tile-box']");
	    webtest.click("class=icon-settings");
	    webtest.click("xpath=//a[@class='icon-selector']");
	    webtest.click("xpath=//span[@class='icon-diamond']");
	    webtest.click("xpath=//button[@data-role='saveTileSetting']");
	}
//	�ı��Ǳ��̱���ɫ     
	@Test(priority=4)
	public void test4() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=�Ǳ���");
//		webtest.pause(2000);
	    webtest.mouseToElement("xpath=//div[@class='tile-box']");
	    webtest.click("class=icon-settings");
	    webtest.click("xpath=//div[@title='ѡ��ͼ�걳��ɫ']");
	    webtest.click("id=00ff33");
	    webtest.click("xpath=//button[@data-role='saveTileSetting']");
	}
//	ͨ���Ǳ��̽��뵽���ݷ���Ȩ�޹�������
	@Test(priority=5)
	public void test5() throws InterruptedException {
	    webtest.click("id=tile_2");
	}
//	ɾ���Ǳ���      ������ɾ��֮��������id�ᷢ���仯
	@Test(priority=6) 
	public void test6() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=�Ǳ���");
	    webtest.mouseToElement("id=tile_12");
	    webtest.click("xpath=//a[@data-id='12']");
	    webtest.alertAccept();
	}

}