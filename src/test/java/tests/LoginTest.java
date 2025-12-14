package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin()
	{
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterUserName("user123");
		loginpage.enterUserName("pass123");
		loginpage.clickSignIn();
		
		System.out.println("Title of the Page: "+driver.getTitle());
	
		Assert.assertEquals(driver.getTitle(), "title");;
	}

}
