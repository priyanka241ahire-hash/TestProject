package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefination {

	WebDriver driver;
	
	@Given("I am the user of facebook application")
	public void i_am_the_user_of_facebook_application() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
	    System.out.println("User Logged in successfully");
	}
}
