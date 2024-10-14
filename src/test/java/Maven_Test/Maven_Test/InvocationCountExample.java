package Maven_Test.Maven_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountExample {

	@Test(invocationCount = 2)
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Maven_Test\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.googe.com");
		driver.manage().window().maximize();
		System.out.println("Login sucess");
	}

}
