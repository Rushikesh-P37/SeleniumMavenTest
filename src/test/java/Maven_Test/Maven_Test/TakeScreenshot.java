package Maven_Test.Maven_Test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		
		//Setting system properties of ChromeDriver
		System.setProperty("window.chrome.driver", "/Drivers/chromedriver.exe");
		
		//Creating an object of ChromeDriver
	    driver = new ChromeDriver();
	    
	  //launching the specified URL 
	    driver.get("https://bstackdemo.com/");
	
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //Take Screenshot 
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    //Copy File
	    FileUtils.copyFile(srcFile, new File("./image.png"));
	    
	    
	    
	    
	    
	    
	    
	    //Switch to Window
	    
//	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	    
//	    driver.switchTo().window(tabs.get(0));
//	    driver.close();
//	    driver.switchTo().window(tabs.get(1));
	    
	}
}
