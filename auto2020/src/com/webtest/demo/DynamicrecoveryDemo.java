package com.webtest.demo;

import org.testng.annotations.Test;

public class DynamicrecoveryDemo extends LoginDemo{
//	��ԭ��̬
	@Test(priority=1)
	public void test47() {
		webtest.click("xpath=//a[@title='΢��']");
	    webtest.click("xpath=//a[@title='΢������վ']");
	    webtest.click("xpath=//input[@value='6']");
	    webtest.click("xpath=//button[text()='��ԭ']");
        webtest.alertAccept();
	}
// ��ն�̬
	@Test(priority=2)
	public void test48() {
	    webtest.pause(5000);
	    webtest.click("xpath=//button[text()='���']");
        webtest.alertAccept();
        webtest.alertAccept();
    }
}
