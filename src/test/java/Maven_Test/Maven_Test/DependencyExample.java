package Maven_Test.Maven_Test;

import org.testng.annotations.Test;

public class DependencyExample {

	@Test(dependsOnMethods = {"TestTwo"})
	public void TestOne() {
		System.out.println("Test One");
	}
	
	@Test
	public void TestTwo() {
		System.out.println("Test Two");
	}
}
