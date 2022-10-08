
package seliniumexample;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='orangehrm-forgot-password-button-container']/button")).click();
		String link = driver.getCurrentUrl();
		Assert.assertEquals(link,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","actual result and expected result");

	}
}