package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppLogin {
	WebDriver driver;
	
	@Given("user is on webshop page")
	public void user_is_on_demowebshop_page() {
		System.out.println("user is on home page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		LoginOR object=new LoginOR(driver);
		
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("display message logged in successfully and logout")
	public void display_message_logged_in_successfully_and_logout() {
	    
	}

}
