package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/features",monochrome=true,
        glue= "stepDefinations",
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        tags="@WebTest",
        plugin={"pretty","html:target/cucumber.html","json:target/jsonReports/cucumber-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
    //		@BeforeClass
//		public void before1()
//		{
//			System.out.println("TestNg");
//		}


}
