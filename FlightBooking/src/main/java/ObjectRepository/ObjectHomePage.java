package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class ObjectHomePage {

	public static By submitButton = By.xpath("//div[@class='container']//input[@type='submit']");
	public static WebElement destinationCityDropDown = Base.getDriver().findElement(By.xpath("//div[@class='container']//form/select[@name='toPort']"));
	public static WebElement departureCityDropDown = Base.getDriver().findElement(By.xpath("//div[@class='container']//form/select[@name='fromPort']"));
	public static By selectDepartureCityXpath(String departureCity)
	{
		return By.xpath("//div[@class='container']//form/select[@name='fromPort']/option[contains(text(),'"+departureCity+"')]");
	}
	
	public static By selectDestinationXpath(String destinationCity)
	{
		return By.xpath("//div[@class='container']//form/select[@name='toPort']/option[@value='"+destinationCity+"']");
	}
	
}
