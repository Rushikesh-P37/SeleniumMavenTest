
package Maven_Test.Maven_Test;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TestAssertFunctions {

	@Test
	public void TestAssert() throws InterruptedException  {

		String chromePath = "C:\\Users\\admin\\eclipse-workspace\\Maven_Test";
		System.setProperty("webdriver.chrome.driver", chromePath + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();

//		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		
		Boolean VerifyTitle = driver.getTitle().equalsIgnoreCase("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		assertTrue(VerifyTitle);
		
		Actions action = new Actions(driver);
		
		WebElement elehover = driver.findElement(By.xpath("//div[contains(@aria-label, 'Electronics')]"));
		action.moveToElement(elehover).perform();
		
		WebElement elehover1 = driver.findElement(By.linkText("Gaming"));
		action.moveToElement(elehover1).perform();
		
		Thread.sleep(2000);
		WebElement elehover2 = driver.findElement(By.linkText("Gamepads"));
		action.moveToElement(elehover2).click().build().perform();
		
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,150)"," ");
		
		
		
		
	}

}
