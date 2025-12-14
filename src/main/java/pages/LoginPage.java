package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userNameTextBox = By.id("username");
	private By passwordTextBox = By.id("password");
	private By signinBtn = By.id("log-in");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterUserName(String userName)
	{
		driver.findElement(userNameTextBox).clear();
		driver.findElement(userNameTextBox).sendKeys("user12");
	}

	public void enterPassword(String Password)
	{
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys("pass12");
	}
	
	public void clickSignIn()
	{
		driver.findElement(signinBtn).click();
		
	}
}
