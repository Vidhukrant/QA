package quotesteps;



import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.Argument;
import utility.Reports;

public class QuoteJourney {
	
	ChromeDriver driver;
	
	public static ExtentReports extent=new ExtentReports("./Report/report.html");
	public static ExtentTest T1;
	
	@Given("^User launch the Browser$")
	public void user_launch_the_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://tmhccsitecoredev-125810-single.azurewebsites.net/#");
	    
	
	    driver.manage().window().maximize();
	    T1=extent.startTest("Browser");
	    extent.endTest(T1);
	   
		
	}

	@When("^User open Homepage$")
	public void user_open_Homepage() throws Throwable {
	    
		 T1=extent.startTest("Home page");
		 T1.log(LogStatus.PASS, "Home page launched successfully");
		    extent.endTest(T1);
	}

	@Then("^User verify that the page displays Single and Annual Multi Trip selection box$")
	public void user_verify_that_the_page_displays_Single_and_Annual_Multi_Trip_selection_box() throws Throwable {
		
		Thread.sleep(2000);
		WebElement Annualtrip=driver.findElementByXPath("//label[@class='btn btn-sm btn-light']");
		Annualtrip.click();
		
		
		Thread.sleep(3000);
		WebElement Strip=driver.findElementByXPath("//label[@class='btn btn-sm btn-light']");
		Strip.click();
		
		
		
	}

	@Then("^User enter country name in  travel destination listbox \"(.*?)\"$")
	public void user_enter_country_name_in_travel_destination_listbox(String Con) throws Throwable {
		
		WebElement Country= driver.findElementById("country");
		Country.click();
		
		Thread.sleep(1000);
		Country.sendKeys(Con);
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[@class='mat-option-text']").click();
	         
	}

	@Then("^User enter date in leaving field \"(.*?)\"$")
	public void user_enter_date_in_leaving_field(String Date) throws Throwable {
		
		WebElement Da=driver.findElementByClassName("mat-icon-button");
		Da.click();
		
		/*WebElement Tdate=driver.findElementById("departDate");
		Tdate.click();*/
		
		Thread.sleep(1000);
		List<WebElement> List1 = driver.findElementsByClassName("mat-calendar-body-cell-content");
		
		for (WebElement cell: List1) {
			
			System.out.println(cell.getText());
            /*
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            */
            //Select Today's Date
           if (cell.getText().equals(Date)) {
                cell.click();
                break;
            }
        }}
		
		
		
		
		
	
		//String W=driver.findElementByXPath("//div[@class='mat-calendar-body-cell-content']").getText();
		
		//System.out.println(W);
		
		/*int a=List.size();
		
		
		
		WebElement AQ=List.get(10);
		
		System.out.println(AQ);
		
		System.out.println(a);
		
		for(int b=1;b<=30;b++)
		{
			
			if(b==1)
			{
				driver.findElementByClassName("mat-calendar-body-cell-content").sendKeys(Date);
			}
		}*/
				 
		//List=driver.findElementsByClassName("mat-calendar-body-cell-content");
		
		//WebElement AB=driver.findElementByLinkText("20");
		
		//AB.click();
		
		//Thread.sleep(1000);
		//AB.sendKeys(Date);
		//Tdate.sendKeys(Date);


	@Then("^the page displays Returning On date field$")
	public void the_page_displays_Returning_On_date_field() throws Throwable {
	    
		WebElement Rdate= driver.findElementById("returnDate");
		Rdate.click();
	}

	@Then("^User enter Age of Primary Traveller \"(.*?)\"$")
	public void user_enter_Age_of_Primary_Traveller(String age) throws Throwable {
	    
		Thread.sleep(1000);
		WebElement Age1= driver.findElementById("ageFirst");
		Age1.click();
		
		Thread.sleep(1000);
	    Age1.sendKeys(age);
	}

	@Then("^User enter Age of Secondry Traveller \"(.*?)\"$")
	public void user_enter_Age_of_Secondry_Traveller(String age2) throws Throwable {
	    
		Thread.sleep(1000);
		WebElement Age1= driver.findElementById("ageSecond");
		Age1.click();
		
		Thread.sleep(1000);
	    Age1.sendKeys(age2);
		
	}

	@Then("^User enter no\\. of dependent \"(.*?)\"$")
	public void user_enter_no_of_dependent(String arg1) throws Throwable {
	    
	}

	@Then("^User enter postcode \"(.*?)\"$")
	public void user_enter_postcode(String Pcode) throws Throwable {
	    
		    Thread.sleep(1000);
		    WebElement postcode=driver.findElementById("stateCode");
		    postcode.sendKeys(Pcode);
	}

	@Then("^the page displays Are you a memeber Deopdown list$")
	public void the_page_displays_Are_you_a_memeber_Deopdown_list() throws Throwable {
	 
		    Thread.sleep(1000);
		    WebElement RACV=driver.findElementById("racvMember");
		    RACV.click();
		    
		    Thread.sleep(1000);
		    driver.findElementByClassName("mat-option-text").click();
	}

	@Then("^the page displays Get a Quote button$")
	public void the_page_displays_Get_a_Quote_button() throws Throwable {
	    
		JavascriptExecutor js=driver;
	    js.executeScript("window.scrollBy(0,250)");
	    
	    Thread.sleep(3000);
	    WebElement Quote=driver.findElementByXPath("//button[@class='btn btn-secondary font-weight-bold custom-theme-group-two']");
	    Quote.click();
	}

	@Then("^User naviagted to Coverage Details page \\(Step (\\d+)\\)$")
	public void user_naviagted_to_Coverage_Details_page_Step(int arg1) throws Throwable {
	    
	}

	@When("^User select one of the coverage plan$")
	public void user_select_one_of_the_coverage_plan() throws Throwable {
	    
	}

	@When("^User select Choose your excess as \\$(\\d+)$")
	public void user_select_Choose_your_excess_as_$(int arg1) throws Throwable {
	    
	}

	@When("^User select Going on a Cruise\\? as Yes$")
	public void user_select_Going_on_a_Cruise_as_Yes() throws Throwable {
	    
	}

	@When("^User select Ski/Winter Sports\\? as Yes$")
	public void user_select_Ski_Winter_Sports_as_Yes() throws Throwable {
	   
	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
	    
		Thread.sleep(6000);
		JavascriptExecutor js=driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(6000);
	    WebElement Continue=driver.findElementByXPath("//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
	    Continue.click();
		
		
	}

	@Then("^User should be naviagted to Customer Details page$")
	public void user_should_be_naviagted_to_Customer_Details_page() throws Throwable {
	    
	}

	@Then("^User enter details of  Primary Traveller First Name \"(.*?)\"$")
	public void user_enter_details_of_Primary_Traveller_First_Name(String Fname) throws Throwable {
		Thread.sleep(3000);
	    WebElement fname1=driver.findElementById("userFirstName");
	    fname1.sendKeys(Fname);
		
		
	}

	@Then("^User enter details of  Primary Traveller Last Name \"(.*?)\"$")
	public void user_enter_details_of_Primary_Traveller_Last_Name(String Lname) throws Throwable {
		Thread.sleep(1000);
	    WebElement lname1= driver.findElementById("mat-input-1");
		
		//WebElement lname1=driver.findElementByXPath("//input[@id='mat-input-1']");
	    lname1.sendKeys(Lname);
		
		
	}

	@Then("^User enter details of  Primary Traveller Date of Birth date \"(.*?)\"$")
	public void user_enter_details_of_Primary_Traveller_Date_of_Birth_date(String DOB) throws Throwable {
		Thread.sleep(1000);
	    WebElement DOB1=driver.findElementById("mat-input-2");
	    DOB1.sendKeys(DOB);
	}

	@Then("^User enter details of  Secondry Traveller First Name \"(.*?)\"$")
	public void user_enter_details_of_Secondry_Traveller_First_Name(String Fname2) throws Throwable {
	    
		    Thread.sleep(1000);
		    WebElement fname2=driver.findElementByXPath("//input[@name='atfirstName']");
		    fname2.sendKeys(Fname2);
	}

	@Then("^User enter details of  Secondry Traveller Last Name \"(.*?)\"$")
	public void user_enter_details_of_Secondry_Traveller_Last_Name(String Lname2) throws Throwable {
		    Thread.sleep(1000);
		    WebElement lname2=driver.findElementById("mat-input-4");
		    lname2.sendKeys(Lname2);
		
	}

	@Then("^User enter details of  Secondry Traveller Date of Birth date \"(.*?)\"$")
	public void user_enter_details_of_Secondry_Traveller_Date_of_Birth_date(String DOB2) throws Throwable {
		
		    Thread.sleep(1000);
		    WebElement dob2= driver.findElementByXPath("//input[@id='mat-input-5']");
		    dob2.sendKeys(DOB2);
	    
	}

	@Then("^User enter Address in street text field \"(.*?)\"$")
	public void user_enter_Address_in_street_text_field(String Addre) throws Throwable {
	    
		 Thread.sleep(1000);
		    WebElement Address=driver.findElementById("mat-input-6");
		    Address.sendKeys(Addre);
	}

	@Then("^User enter Subrb in Subrb text field \"(.*?)\"$")
	public void user_enter_Subrb_in_Subrb_text_field(String SUb) throws Throwable {
	   
		    Thread.sleep(1000);
		    WebElement subrb=driver.findElementById("mat-input-7");
		    subrb.sendKeys(SUb);
	}

	@Then("^User select the state from state drop down$")
	public void user_select_the_state_from_state_drop_down() throws Throwable {
	    
		Thread.sleep(1000);
	    WebElement state=driver.findElementById("mat-input-8");
	    state.click();
	    
	    Thread.sleep(700);
	    driver.findElementByClassName("mat-option-text").click();
	}

	@Then("^User enter post code \"(.*?)\"$")
	public void user_enter_post_code(String Pcode1) throws Throwable {
		 Thread.sleep(1000);
		    WebElement Pcode= driver.findElementById("mat-input-9");
		    Pcode.sendKeys(Pcode1);
	}

	@Then("^User enter email address in email address text box \"(.*?)\"$")
	public void user_enter_email_address_in_email_address_text_box(String gmail) throws Throwable {
	   
		    Thread.sleep(2000);
		    WebElement mail=driver.findElementById("mat-input-10");
		    mail.sendKeys(gmail);
		    
		    Thread.sleep(2000);
		    WebElement Cmail= driver.findElementById("mat-input-11");
		    Cmail.sendKeys(gmail);
	}

	@Then("^User enter primary phone number \"(.*?)\"$")
	public void user_enter_primary_phone_number(String Phone) throws Throwable {
	   
		Thread.sleep(2000);
	    WebElement phn=driver.findElementById("mat-input-12");
	    phn.sendKeys(Phone);
	}

	@Then("^the page displays Dependents First name text field in Dependents section$")
	public void the_page_displays_Dependents_First_name_text_field_in_Dependents_section() throws Throwable {
	    
	}

	@Then("^the page displays Dependents Last name text field in Dependents section$")
	public void the_page_displays_Dependents_Last_name_text_field_in_Dependents_section() throws Throwable {
	    
	}

	@Then("^the page displays Dependents Age text field in Dependents section$")
	public void the_page_displays_Dependents_Age_text_field_in_Dependents_section() throws Throwable {
	    
	}

	@Then("^the page displays Yes/No selection box in Medical conditions not found in the automatically covered conditions question$")
	public void the_page_displays_Yes_No_selection_box_in_Medical_conditions_not_found_in_the_automatically_covered_conditions_question() throws Throwable {
	    
		Thread.sleep(2000);
		JavascriptExecutor js=driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(2000);
	    WebElement yes=driver.findElementByClassName("mat-button-toggle-label-content");
	    yes.click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,200)");
	    
	    Thread.sleep(2000);
	    WebElement confirm=driver.findElementByXPath("//button[@type='submit']");
	    confirm.click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,-1000)");
	    
	    Thread.sleep(2000);
	    WebElement yes1=driver.findElementByClassName("mat-button-toggle-label-content");
	    yes1.click();
	}

	@Then("^the page displays Confirm and Finalize Quote button$")
	public void the_page_displays_Confirm_and_Finalize_Quote_button() throws Throwable {
	    
		Thread.sleep(3000);
		JavascriptExecutor js=driver;
	    js.executeScript("window.scrollBy(0,700)");
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,-700)");
	    Thread.sleep(3000);
	    
	    
	   WebElement Assess=driver.findElementByXPath("//button[@class='btn btn-secondary assess-btn ng-star-inserted']");
	   Assess.click();
	   
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,500)");
	   
	   /*List a=driver.findElements(By.xpath("//button[@class='btn btn-secondary']"));
	  
	   
	  int q=a.size();
	  System.out.println(q);*/
	}

	@Then("^User should be naviagted to Payemnt Details page \\(Step (\\d+)\\)$")
	public void user_should_be_naviagted_to_Payemnt_Details_page_Step(int arg1) throws Throwable {
		
		extent.flush();
		extent.close();
		driver.close();
	    
	}
	
	


}
