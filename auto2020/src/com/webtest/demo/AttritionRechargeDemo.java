package com.webtest.demo;

import org.testng.annotations.Test;

public class AttritionRechargeDemo extends LoginDemo{
//	查看用户流失率统计图
	@Test(priority=1)
	public void test15() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=流失率统计");
	    webtest.pause(2000);
	}
//	查看充值用户统计
	@Test(priority=2)
	public void test22() throws InterruptedException {
		webtest.mouseToElement("xpath=//a[@data-hover='dropdown']");
	    webtest.click("link=充值用户统计");
	}
}
