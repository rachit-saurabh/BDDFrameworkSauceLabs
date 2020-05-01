package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = "C:\\Users\\admin\\eclipse-workspace\\SaucedemoBDDFramework\\src\\test\\java\\features",
glue= {"stepdefinition"},
monochrome = true
)
public class testrunner {
}