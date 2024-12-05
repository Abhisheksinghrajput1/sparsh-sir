package Scriza.Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Match_Program {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Manage the window
		driver.manage().window().maximize();
		
		// Open Google
		
		driver.get("https://www.google.com/");
		
		// Used wait commands
		Thread.sleep(50);
		
		// Open Google we will open the school erp
		driver.get("https://school-erp-super-admin-pannel.vercel.app/");
		
		// Used wait commands
		Thread.sleep(50);
		
		
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("garima@scriza.in");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Scriza@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/form/div[4]/a")).click();
		
		// Find the Title...
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		// Print the title in Console...
		String Expected_Title ="Super Admin School ERP";
		String Actual_Title = driver.getTitle();
		
		// If and Else condition
		if(Actual_Title.equals(Expected_Title));
		{
			System.out.println("Login Sucessfully");
		}
	
		
			
		}
		
		
		

	}

