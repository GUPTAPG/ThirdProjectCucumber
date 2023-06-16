package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		
	 features = "src/test/resourses/features/BackgroundChange.feature",
	 glue ="steps",
	tags = {"@run"},
	 monochrome =true,
	 dryRun=false,//always false or commented out
	 //dryrun is just to cheack is there anu initilazation error or not
			
	 plugin= {
		"pretty",
			 "html:target/reports/cucumber.html",
			 "json:target/reports/cucumber.json"
	 }
	 )	 
	 
public class RunnerTest {

}
