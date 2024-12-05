package FindElement_FindElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElement {

	public static void main(String[] args) throws InterruptedException {
	
		
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.scriza.in/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='site-map ps-0']//li//a[@href='custom-software-development'][normalize-space()='Custom Software Development']")).click();
		Thread.sleep(3000);
		
		System.out.println("");
		
		driver.close();
	}

}
