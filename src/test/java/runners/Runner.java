package runners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        features = "src/test/resources/FeatureFiles",
        glue = "steps",
               
        )
public class Runner extends AbstractTestNGCucumberTests{
	  
	    }

}
