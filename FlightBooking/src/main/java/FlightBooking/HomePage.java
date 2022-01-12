package FlightBooking;

import java.io.IOException;

import ObjectRepository.ObjectHomePage;
import Resources.Base;
import Utility.CommonMethods;

public class HomePage {

	//select value from departure city dropdown
	public static void selectDepartureCity() throws IOException
	{
		CommonMethods.selectByVisibleText(ObjectHomePage.departureCityDropDown, Base.getPropertiesData("departureCity"));
	}
	
	// select value from destination city dropdown
	public static void selectDestinationCity() throws IOException
	{
		CommonMethods.selectByVisibleText(ObjectHomePage.destinationCityDropDown, Base.getPropertiesData("destinationCity"));
	}
	
	//click submit
	public static void clcikSubmit()
	{
		Base.getDriver().findElement(ObjectHomePage.submitButton).click();
	}
}
