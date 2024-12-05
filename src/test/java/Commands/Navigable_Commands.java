package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigable_Commands {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		

		
		
		
		// get to navigate the browser by navigate().to() command 
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(500);
		driver.get("https://school-erp-super-admin-pannel.vercel.app/");
		
		
		Thread.sleep(1000);
		// by using navigate().back() command is used for to navigate back one page to another page... 
		driver.navigate().back();
		
		
		Thread.sleep(1000);
		// By using navigate().forward() command is used to forward one page to another page...
		driver.navigate().forward();
		
		
		Thread.sleep(1000);
		// By using navigate().refresh() command is used to refresh the page...
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("garima@scriza.in");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Scriza@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/form/div[4]/a")).click();
		Thread.sleep(1000);

	}

}
