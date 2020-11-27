package com.webtest.demo;

import org.testng.annotations.Test;

public class DynamicrecoveryDemo extends LoginDemo{
//	还原动态
	@Test(priority=1)
	public void test47() {
		webtest.click("xpath=//a[@title='微博']");
	    webtest.click("xpath=//a[@title='微博回收站']");
	    webtest.click("xpath=//input[@value='6']");
	    webtest.click("xpath=//button[text()='还原']");
        webtest.alertAccept();
	}
// 清空动态
	@Test(priority=2)
	public void test48() {
	    webtest.pause(5000);
	    webtest.click("xpath=//button[text()='清空']");
        webtest.alertAccept();
        webtest.alertAccept();
    }
}
