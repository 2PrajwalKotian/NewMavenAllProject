package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMAppcucumber {

	private static WebDriver driver = null;
    @Given("Open the application login page in browser")
    public void Open_the_application_login_page_in_browser()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
    }
   @When("User enters user name and password")
    public void User_enters_user_name_and_password() {
        
         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
   	}
    @Then("home page will be displayed")
    public void home_page_will_be_displayed() {
           String actualresult, expectedresult;
            expectedresult="PIM";
            actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
            SoftAssert soft= new SoftAssert();
            soft.assertEquals(actualresult, expectedresult);
    }
    

	@Given("Click Leave and Apply entity")
	public void click_leave_and_Apply_entity() {
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();

	}

	@Then("Enter leave type and date and reason")
	public void Enter_leave_type_and_date_and_reason() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
		 driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
		 Thread.sleep(2000);
	}

	@Then("click on Apply button")
	public void click_on_apply_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
 	@Given("Click on Admin entity")
 	public void clicl_on_admin_entity(){
 		driver.findElement(By.xpath("//a/span")).click();
 	}
 	
	
 	@Then("Give Username as {string} and employeeName as {string}")	

 	public void search(String string, String string1) {
 		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
 		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(string1);
 		driver.findElement(By.xpath("//form//div//button[2]")).click();	
 	 }
 	@Then("Give Username as {string}")
 	public void search(String string) throws InterruptedException {
 		driver.findElement(By.xpath("//a/span")).click();
 		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
 		driver.findElement(By.xpath("//form//div//button[2]")).click();
 		Thread.sleep(2000);
	}
 	}      

