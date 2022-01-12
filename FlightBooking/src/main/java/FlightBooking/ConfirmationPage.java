package FlightBooking;

import static org.testng.Assert.assertTrue;

import ObjectRepository.ObjectConfirmationPage;
import Resources.Base;

public class ConfirmationPage {

	public static void verifyPurchase()
	{
		String successMessage = Base.getDriver().findElement(ObjectConfirmationPage.successMessage).getText();
		try
		{
			if(successMessage.contains(Base.getPropertiesData("successMessageKeyword")))
			{
				System.out.println("--------Successfully booked Flight Ticket-------------");
				System.out.println();
				System.out.println(Base.getDriver().findElement(ObjectConfirmationPage.id).getText());
				System.out.println(Base.getDriver().findElement(ObjectConfirmationPage.status).getText());
				System.out.println(Base.getDriver().findElement(ObjectConfirmationPage.amount).getText());
				System.out.println(Base.getDriver().findElement(ObjectConfirmationPage.date).getText());
				assertTrue(true);
			}
			else
			{
				System.out.println("We Encountered a problem in Booking please retry");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
