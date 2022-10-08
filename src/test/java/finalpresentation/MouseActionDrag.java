package finalpresentation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDrag {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://jqueryui.com/draggable/");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		   WebElement Fram=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		   driver.switchTo().frame(Fram);
		   WebElement drag =driver.findElement(By.id("draggable"));
		   Actions mouse=new Actions(driver);
		   mouse.dragAndDropBy(drag,100,10).perform();
	}
}





