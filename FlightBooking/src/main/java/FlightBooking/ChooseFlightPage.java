package FlightBooking;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import ObjectRepository.ObjectChooseFlight;
import Resources.Base;
import Utility.CommonMethods;

public class ChooseFlightPage {

	//verify Choose flight Page has departure city and desitnation city
	public static void verifyCityText() throws IOException
	{
		String chooseFlightLabel = ObjectChooseFlight.chooseFlightHeader.getText();
		String departureCity = Base.getPropertiesData("departureCity");
		String destinationCity = Base.getPropertiesData("destinationCity");
		
		if((CommonMethods.compareString(chooseFlightLabel, departureCity)) && (CommonMethods.compareString(chooseFlightLabel, destinationCity)))
		{
			System.out.println("------------Successfully verified Departure City and Destination City-----------");
			assertEquals(true, true);
		}
		else
		{
			System.out.println("Departure City and Destination city do not match");
			assertTrue(false);
		}
	}
	
	public static void chooseFlight() throws IOException
	{
		List<WebElement> priceList = ObjectChooseFlight.priceList;
		String price = Base.getPropertiesData("Price");
		try {
			if(CommonMethods.selectValueFromList(priceList, price))
			{
				Base.getDriver().findElement(ObjectChooseFlight.chooseFlightXPath(price)).click();
			}
			else
			{
				System.out.println("Price matching Flight not found");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
