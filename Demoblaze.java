package Task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();  //Launch the driver
		
		driver.manage().window().maximize();   //maximize the window
		
		
		driver.get("https://demoblaze.com");  //load the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //use implicitlywait to wait to search the element
		
		driver.findElement(By.linkText("Laptops")).click();  //to click the laptop section
		
		Thread.sleep(3000);   //use thread sleep for delyed searching elements
		
		driver.findElement(By.linkText("Sony vaio i5")).click();    //to select the first laptop
		
				
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();    // click add cart button
		
		
		driver.close();
		

	}

}
