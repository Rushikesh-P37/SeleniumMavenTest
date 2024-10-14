package Maven_Test.Maven_Test;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Group A"})
	public void Login() {
		System.out.println("Login Page");
	}
	
	@Test(groups = {"Group B"})
	public void LogOut() {
		System.out.println("Logout Page");
	}

}
