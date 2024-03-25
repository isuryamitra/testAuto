package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_pc {
	
	WebDriver driver;
	
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By forgot=By.xpath("//p[contains(@class,'login-forgot-header')]");
	By submit=By.xpath("//button[@type=\"submit\"]");
			
	
	public Login_pc(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUsername(String uname) throws InterruptedException
	{
		
		driver.findElement(username).sendKeys(uname);
		
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public void clickLogin()
	{
		driver.findElement(submit).click();
		
	}
	public void clickForgot() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(forgot).click();
	}
	

}
