package Commands;


import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Commands {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	
	// there is use data type and variable not directly use the driver.findElements 	
	WebElement ele = driver.findElement(By.xpath("//input[@value='Male']"));
	ele.click();
	
	// Is displayed command is used to check the options is working or not or print the data on console 
	// Long Way to use isdispalyed command 
	//boolean ele1 = ele.isDisplayed();
    //System.out.println(ele1);
  
	
	
	// Easy way to use the isdisplayed command 
	//System.out.println("if working    " + ele.isDisplayed());
	
	// easy way to use the isenabled command
	//System.out.println(ele.isEnabled());
	
	
	// Long Way to use the isEnabled command )
	//boolean ele2 = ele.isEnabled();
	
	//System.out.println("if working    " + ele.isEnabled());

	// easy way to use the isSelected() command 
	//System.out.println(ele.isSelected());
	
	// long way to use the isSelected command 
	boolean ele1= ele.isSelected(); 

	 System.out.println(ele1);
	}

}
