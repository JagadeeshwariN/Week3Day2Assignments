package week3.day2.assignments;

public class WebElement {

	
	// Create a base class named WebElement with common methods such as click() and setText(String text).
	/*
	 * Subclasses: Button and TextField - Implement two subclasses, Button and
	 * TextField, both inheriting from the WebElement base class. - In the Button
	 * subclass, include a submit() method. - In the TextField subclass, include a
	 * getText() method.
	 */
	public void click()
	{
	System.out.println("Just Click");	
	}
	
	public void setText(String text)
	{
		
		System.out.println("Text Setting");
	}
}
