package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashBoard_Page extends TestBase {

	public DashBoard_Page() {

		PageFactory.initElements(driver, this);
	}

}
