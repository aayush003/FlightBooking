package FlightBooking;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class EndToEndTest extends Base{
	
	@Test(priority = 0)
	public void homePageTest() throws IOException
	{
		Base.initializeDriver(Base.getPropertiesData("URL"));
		HomePage.selectDepartureCity();
		HomePage.selectDestinationCity();
		HomePage.clcikSubmit();
	}
	
	@Test(priority = 1)
	public void chooseFlightTest() throws IOException
	{
		ChooseFlightPage.verifyCityText();
		ChooseFlightPage.chooseFlight();
	}
	
	@Test(priority = 2)
	public void enterBookingDetails() throws IOException
	{
		PurchaseFlightTicketPage.addUserDetails();
		PurchaseFlightTicketPage.clickPurchaseFlightButton();
	}

}
