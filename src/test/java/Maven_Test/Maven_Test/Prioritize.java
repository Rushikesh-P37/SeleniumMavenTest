package Maven_Test.Maven_Test;

import org.testng.annotations.Test;

public class Prioritize {
	
	@Test(testName = "Login", description = "Enter the username and password", priority = 1)
	public void Login() {
		System.out.println("Sucessfully Login");
	}
	
	@Test(testName = "Logout", description = "Click on logout button", priority = 3)
	public void Logout() {
		System.out.println("Sucessfully Logout");	
	}
	
	@Test(description = "View the homepage details", priority = 2)
	public void HomePage() {
		System.out.println("Navigate to Homepage");
	}
	
	@Test(description = "Search or filter the user information", priority = 2)
	public void SearchData() {
		System.out.println("Filter the user information");
	}
}
