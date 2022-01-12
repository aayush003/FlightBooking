package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public static void selectByVisibleText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static boolean compareString(String text, String word)
	{
		boolean flag = false;
		if(text.contains(word))
			flag = true;
		return flag;
	}
	
	public static boolean selectValueFromList(List<WebElement> elements, String value)
	{
		boolean flag = false;
		for(WebElement element : elements)
		{
			if(element.getText().equals(value))
			{
				flag = true;
				break;
			}	
		}
		return flag;
	}
}
