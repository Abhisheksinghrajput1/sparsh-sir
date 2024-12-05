package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		// get to navigate the browser
		driver.get("https://www.google.com/");
		Thread.sleep(50);
		driver.get("https://school-erp-super-admin-pannel.vercel.app/");
		
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("garima@scriza.in");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Scriza@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/form/div[4]/a")).click();
		Thread.sleep(100);
		
		// getTitle Command 
		String title = driver.getTitle();

	    // Print the title
	 System.out.println("Page title is: " + title);
	       
	 
	// getCurrenturl Command 
	 String url = driver.getCurrentUrl();  
      
	 //Print The Url 
	 System.out.println("Page URl is: " + url);
	 
	 Thread.sleep(3000);
	 
	 //getPageSource   easily Way to find 
	 
	 //System.out.println("Page Source is" + driver.getPageSource());
	 
	 // 2nd way to find the getPageSource 
	 String page_Source= driver.getPageSource();
	 
	 System.out.println("Page Source is" + page_Source);
	 
	 
	 //getWindowHandle easy way to find 
	// System.out.println("Page Source is" + driver.getWindowHandle());
	 
	 
	 // 2nd Way to find the  getWindowHandle
	 
	 String Window = driver.getWindowHandle();
	 System.out.println("Window Handle is   " + Window);
	  driver.close();

	}

}
