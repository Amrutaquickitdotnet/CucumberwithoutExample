package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\CucumberProject\\CucumberProject_2_Data_Driven_WithoutExampleKeyword\\src\\test\\java\\Features\\login.feature",
		
		glue= {"stepDefination"}
		
		)


public class testrunner 
{


}
