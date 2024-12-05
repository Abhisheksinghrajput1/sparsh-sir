package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(50);
		driver.get("https://school-erp-super-admin-pannel.vercel.app/");
		
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("garima@scriza.in");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Scriza@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/form/div[4]/a")).click();
		Thread.sleep(50000);
		
		// close command
		// to close only current window 
		//driver.close();
		
		// quit command 
		// Close all the window 
		driver.quit();
		
	}

}
