package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefs {
	
	ChromeDriver driver;
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().window().maximize();
	}

	@When("^user click on signin link$")
	public void user_click_on_signin_link() throws Throwable {
	driver.findElementByXPath("//a[@title='Log in to your customer account']").click();
	    	}

	@When("^User enter username \"(.*?)\"$")
	public void user_enter_username(String uname) throws Throwable {
		
		driver.findElementById("email").sendKeys(uname);
	    
	}

	@When("^User enter password \"(.*?)\"$")
	public void user_enter_password(String psw) throws Throwable {
	driver.findElementByXPath("//input[@type='password']").sendKeys(psw);
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		driver.findElementById("SubmitLogin").click();
	    
	}

	@Then("^validate user logged in successfully$")
	public void validate_user_logged_in_successfully() throws Throwable {
		
		Assert.assertTrue(driver.findElementByXPath("//a[@title='Return to Home']").isDisplayed());
		driver.close();
	    	}

}
