package Maven_Test.Maven_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ApplicationTest {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver;
		
		System.setProperty("webdriver.chrome.diver", "/Drivers/chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();		
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//create the reference
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		//Get the title of the page through javascriptExecutor
		String titleText = js.executeScript("return document.title;").toString();
		System.out.println("Title is: "+titleText);
		
		Thread.sleep(3000);  //Click on Book a Free Demo
		driver.findElement(By.cssSelector(".web-menu-btn .btn-contact-sales")).click();
		
		
		//Enter the text without using sendKeys method.
		Thread.sleep(1000);
		js.executeScript("document.getElementById('Form_getForm_FullName').value='Rushikesh';");
		
	
		
		
	}
}
