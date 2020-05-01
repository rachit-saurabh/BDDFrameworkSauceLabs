package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemoTestStepDefinition {

	WebDriver driver;

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}

	@When("^when page title is Swag Labs$")
	public void when_page_tile_is_Swag_Labs() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Swag Labs");
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("^user redirected to the home page$")
	public void user_redirected_to_the_home_page() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"))
				.isDisplayed();
		System.out.println(b);
	}

	@And("^close the driver$")
	public void close_the_driver() {
		driver.quit();
	}

}
