package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Login/Quote.feature",
glue="quotesteps",monochrome=true)



public class TestRunner {

}
