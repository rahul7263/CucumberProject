package stepDefenation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
     
	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() throws InterruptedException {
	   
		System.out.println("Step1: user is on login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}

	@When("user enters username and passowrd")
	public void user_enters_username_and_passowrd() {
		System.out.println("Step2: user enters username and password");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3: user is cliked on login button ");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	   
		System.out.println("Step4: user enters home page");
		driver.close();
	}
}
