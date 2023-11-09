package week3.day2.assignments;

public class LoginTestData extends TestData {

	
	// Create subclasses and create 2 methods in each LoginTestData - enterUsername() - enterPassword()
	public void enterUsername()
	{
		System.out.println("Enter User Name");
	}
	
	public void enterPassword()
	{
		System.out.println("Enter Password");
	}
	
public static void main(String[] args) {
	
	LoginTestData object= new LoginTestData();
	object.enterCredentials();
	object.navigateToHomePage();
	object.enterUsername();
	object.enterPassword();

	}
	
}
