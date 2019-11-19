package utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reports {

	public static ExtentReports extent;
	public static ExtentTest T1;
	
	String s;
	public static void report()
	{
		
	    extent= new ExtentReports("./Report/report.html");
		T1=extent.startTest("Quote Journey");
		
        extent.endTest(T1);
		
		extent.flush();
		extent.close();
	}
}
