package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class ObjectChooseFlight {

	public static WebElement chooseFlightHeader = Base.getDriver().findElement(By.xpath("//div[@class='container']/h3"));
	public static List<WebElement> priceList = Base.getDriver().findElements(By.xpath("//table[@class='table']//tbody//td[6]"));
	
	public static By chooseFlightXPath(String price)
	{
		return By.xpath("//table[@class='table']//tbody//td[contains(text(), '"+price+"')]/preceding-sibling::td/input[@type='submit']");
	}
			
}
