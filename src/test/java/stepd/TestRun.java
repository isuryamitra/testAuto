package stepd;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue="stepd",tags = "@Tag1", monochrome=true)

public class TestRun {
	

}



