package HandleCheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(2000);
List <WebElement> checkbox =driver.findElements(By.xpath("//input[contains(@id,'day')]"));

// for each loop
/*for (WebElement checkbox1: checkbox) 
{
   checkbox1.click();
   Thread.sleep(3000);
}
*/

for(int i = 3;i<=checkbox.size()-2;i++)
{
	checkbox.get(i).click();
}

	}

}
