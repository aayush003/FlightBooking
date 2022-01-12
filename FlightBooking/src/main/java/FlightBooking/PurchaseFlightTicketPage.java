package FlightBooking;

import java.io.IOException;

import ObjectRepository.ObjectPurchaseFlightTicket;
import Resources.Base;
import Utility.CommonMethods;

public class PurchaseFlightTicketPage {

	public static void addUserDetails() throws IOException
	{
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.userName).sendKeys(Base.getPropertiesData("userName"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.address).sendKeys(Base.getPropertiesData("address"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.city).sendKeys(Base.getPropertiesData("city"));
		//scroll down the window
		CommonMethods.scrollDownWindow();
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.state).sendKeys(Base.getPropertiesData("state"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.zipCode).sendKeys(Base.getPropertiesData("zipCode"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.zipCode).sendKeys(Base.getPropertiesData("zipCode"));
		//select card type from dropdown
		CommonMethods.selectByVisibleText(ObjectPurchaseFlightTicket.cardType, Base.getPropertiesData("cardType"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.creditCardNumber).sendKeys(Base.getPropertiesData("creditCardNumber"));
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.nameOnCard).sendKeys(Base.getPropertiesData("nameOnCard"));
	}
	
	public static void clickPurchaseFlightButton()
	{
		Base.getDriver().findElement(ObjectPurchaseFlightTicket.purchaseFlightButton).click();
		System.out.println("-------Flight Details Entered Successfully------------");
	}
}
