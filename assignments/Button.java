package week3.day2.assignments;

public class Button extends WebElement {

	public static void main(String[] args) 
	{
	
		Button buttonObj = new Button();
	
	buttonObj.click();
	buttonObj.setText("Hello");
	buttonObj.submit();

	}

	public void submit() {
		
		System.out.println("Button Submit");
	}
}
