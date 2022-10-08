package seliniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("C:\\Users\\EI13109\\Downloads\\WebTable.html");
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
	}
}
