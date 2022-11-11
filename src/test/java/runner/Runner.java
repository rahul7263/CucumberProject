package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber .class)
@CucumberOptions(features="src/test/resources/Features",glue= {"setpDefenation"},
monochrome=true,

plugin= {"html:Reports\\HTMLReports","json:Reports\\JsonReports\\Cucumber.json","junit:Reports\\JUnitReprots\\Cucumber.xml"},

dryRun=true
//strict=true
)
public class Runner {

	
}
