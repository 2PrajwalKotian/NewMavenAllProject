package seliniumexample;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchFieldHRM {
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		SearchFieldHRM obj = new SearchFieldHRM();
		String username="aarushkoppala";
		String empname="Aarush Koppala";
		obj.login();
		obj.search(username);
		obj.search(username,empname);
	}
	public void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public void search(String username)
	{
		driver.findElement(By.xpath("//li/a")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
	public void search(String username,String empname) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li/a")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
		driver.findElement(By.xpath("//form//div[2]//input[@placeholder='Type for hints...']")).sendKeys(empname);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
}
