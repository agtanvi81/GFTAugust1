package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	WebDriver driver;


	@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.out.println("user is on home page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		LoginOR object=new LoginOR(driver);
		

		System.out.println("user enters username and password");
		object.usern.sendKeys("tomsmith");
		object.passw.sendKeys("SuperSecretPassword!");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
		driver.findElement(By.className("radius")).click();

	}
	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("user logged in successfully");

	}

}
