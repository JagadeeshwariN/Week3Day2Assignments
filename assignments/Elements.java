package week3.day2.assignments;

public class Elements extends Button {

	public static void main(String[] args) {
		
		
		Elements elementsObj= new Elements();
		elementsObj.click();
		elementsObj.setText("Hello");
		elementsObj.submit();
		
		
		CheckBoxButton chkBoxObj= new CheckBoxButton();
		chkBoxObj.clickCheckButton();
		
		RadioButton radioObj= new RadioButton();
		radioObj.selectRadioButton();
		
		TextField textFieldObj = new TextField();
		textFieldObj.getText();

		
	}

}
