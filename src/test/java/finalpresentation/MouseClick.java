package finalpresentation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   Actions mouse=new Actions(driver);
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		   mouse.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).build().perform();
		   Thread.sleep(100);
		   driver.findElement(By.xpath("//li[.='Edit']")).click();
		   Alert alert =driver.switchTo().alert();
		   String P=alert.getText();
		   System.out.println(P);
		   alert.accept();

}
}