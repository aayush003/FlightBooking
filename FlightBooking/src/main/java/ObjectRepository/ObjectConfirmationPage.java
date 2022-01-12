package ObjectRepository;

import org.openqa.selenium.By;

public class ObjectConfirmationPage {

	public static By successMessage = By.xpath("//div[@class='container hero-unit']/h1");
	public static By status = By.xpath("//table//td[contains(text(),'Status')]/following-sibling::td");
	public static By id = By.xpath("//table//td[contains(text(),'Id')]/following-sibling::td");
	public static By amount = By.xpath("//table//td[contains(text(),'Amount')]/following-sibling::td");
	public static By date = By.xpath("//table//td[contains(text(),'Date')]/following-sibling::td");
}
