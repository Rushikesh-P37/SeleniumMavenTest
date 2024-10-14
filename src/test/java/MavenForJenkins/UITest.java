package MavenForJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class UITest {
	
	@Test
	public void openBrowser() {
		String path ="C:\\Users\\admin\\eclipse-workspace\\Fkart_Application\\Drivers";
		System.setProperty("webdriver.chrome.driver", path+"/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		driver.quit();
	}

}
