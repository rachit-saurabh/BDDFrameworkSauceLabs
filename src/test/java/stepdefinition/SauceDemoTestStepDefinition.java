package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemoTestStepDefinition 
{

	WebDriver driver;

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}

	@When("^when page title is SwagLabs$")
	public void when_page_tile_is_SwagLabs() 
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
	}

	@Then("^user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_username_and_password(String username, String password) 
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("^user redirected to the home page$")
	public void user_redirected_to_the_home_page()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);
	}

	@And("^close the driver$")
	public void close_the_driver() 
	{
		driver.quit();
	}

}
