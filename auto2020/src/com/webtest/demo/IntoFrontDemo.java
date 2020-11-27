package com.webtest.demo;

import org.testng.annotations.Test;

public class IntoFrontDemo extends LoginDemo{
//	进入前台
	@Test(priority=1)
	public void test23() throws InterruptedException {
		webtest.click("class=icon-copy");
	}

}
