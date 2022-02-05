package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	static WebDriver driver;
	@Given("I have valid url to be enter")
	public void i_have_valid_url_to_be_enter() {
		System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		 driver.manage().window().maximize();
	}
	   
	@When("I enter {string} details And I enter {string} Details")
	public void i_enter_details_and_i_enter_details(String username, String password)
	{
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("I can able to login successfully")
	public void i_can_able_to_login_successfully() {
	    System.out.println("successfully login");
	}



}
