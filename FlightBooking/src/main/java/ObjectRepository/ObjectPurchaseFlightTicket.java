package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class ObjectPurchaseFlightTicket {

	public static By userName = By.xpath("//input[@id='inputName']");
	public static By address = By.xpath("//input[@id='address']");
	public static By city = By.xpath("//input[@id='city']");
	public static By state = By.xpath("//input[@id='state']");
	public static By zipCode = By.xpath("//input[@id='zipCode']");
	public static By creditCardNumber = By.xpath("//input[@id='creditCardNumber']");
	public static By nameOnCard = By.xpath("//input[@id='nameOnCard']");
	public static By purchaseFlightButton = By.xpath("//input[@type='submit' and @value='Purchase Flight']");
	public static WebElement cardType = Base.getDriver().findElement(By.xpath("//select[@id='cardType']"));
	
	public static By selectCardtTypeXpath(String cardType)
	{
		return By.xpath("//select[@id='cardType']/option[contains(text(),'"+cardType+"')]");
	}
}
