package FindElement_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.scriza.in/");
		
		Thread.sleep(2000);

        // Find multiple elements by class name
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"rs-footer\"]/div[1]/div/div/div[3]"));
System.out.println(elements.size());
        // Iterate over the list of elements using a for loop


// By Using For Loop 


/**    for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i); // Access the current element

            // Print the text of each element
            System.out.println("Element " + (i + 1) + ": " + element.getText());

        }

        // Close the browser
        driver.quit();
    }


	}

 */



// Using For Each loop 

for (WebElement element : elements) {
    // Print the text of each link
    System.out.println(element.getText());

    // Optionally, perform other actions (e.g., click on a specific element)
}
Thread.sleep(2000);
// Close the browser
driver.quit();
	}
}


