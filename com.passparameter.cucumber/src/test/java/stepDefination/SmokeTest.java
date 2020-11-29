package stepDefination;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public static WebDriver driver;

	@Given("^Open chrome browser and start application$")
	public void open_chrome_browser_and_start_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		driver= new ChromeDriver();
		String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@When("^I enter the valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_the_valid_and_valid(String uname, String pass) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-username")).sendKeys(uname);
		driver.findElement(By.id("input-password")).sendKeys(pass);
	}

	@Then("^User should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
	}

@Then("^check title$")
public void check_title() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
    Assert.assertEquals("Dashboard",driver.getTitle());
}
	@Then("^Closed Browser$")
	public void closed_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    driver.close();
	}


}
