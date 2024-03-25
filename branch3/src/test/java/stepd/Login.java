package stepd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.Login_pc;
public class Login {
	
	WebDriver driver=new FirefoxDriver();
	Login_pc ob=new Login_pc(driver);
	
@Before
public void beforeScenario() throws IOException{
	//ChromeOptions chromeOptions = new ChromeOptions();
	
	FileInputStream f = new FileInputStream("C:\\Users\\Surya Mitra\\Automation\\testAutomation_New\\src\\test\\java\\config.properties");
	Properties p=new Properties();
	p.load(f);
	driver.get(p.getProperty("url"));
	
	
	
	
}
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
	    System.out.println("At Login page");
	    Thread.sleep(5000);
	    ob.setUsername("Admin");
	    ob.setPassword("admin123");
	    ob.clickLogin();
	    
	    
	    
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("asdasdas");
	}
	@When("Click on Login")
	public void click_on_login() {
		 System.out.println("asdasdas");
	}
	@Then("Homepage should open")
	public void homepage_should_open() {
		System.out.println("Homepage Opens");
	}
	@Then("User should see Dashboard text")
	public void user_should_see_dashboard_text() {
		 System.out.println("asdasdfsdfsdas");
	}


	@When("Click on Forgot Password button")
	public void click_on_forgot_password_button() throws InterruptedException {
	    ob.clickForgot();
	}
	@Then("User should see Forgot password page")
	public void user_should_see_forgot_password_page() {
	    System.out.println("At Forgot Password Page");
	}



	

}
