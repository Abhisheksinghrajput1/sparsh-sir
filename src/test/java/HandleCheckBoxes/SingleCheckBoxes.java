package HandleCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	
	}
	

}
