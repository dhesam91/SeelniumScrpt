package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "classpath:features",
		features = "src/test/resources/features/Flight.feature",
		//features = "src/test/resources/features/ObjectIdentification.feature",
		//features = "src/test/resources/features/MercuryRegistartion_DataDriven.feature",		
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/Destination/cucumber.json"},
		//format={"json:target/Destination/cucumber.json"})
		monochrome = true,
		tags = {}
		)
public class TestRunner{
	
}

//@CucumberOptions( monochrome = true,plugin = {"html:targetok/cucumber-html-report", "json:target/cucumber-json-report.json" })