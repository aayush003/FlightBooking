package FlightBooking;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class HomePageTest extends Base{

	@Test
	public void homePageTest() throws IOException
	{
		Base.initializeDriver(Base.getPropertiesData("URL"));
		HomePage.selectDepartureCity();
		HomePage.selectDestinationCity();
		HomePage.clcikSubmit();
	}
}
