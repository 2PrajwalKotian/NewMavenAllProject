package seliniumexample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Prajwal");
		driver.findElement(By.name("lastname")).sendKeys("Kotian");
		driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@12abcd");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("birthday_day")).sendKeys("10");
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
	}

}

