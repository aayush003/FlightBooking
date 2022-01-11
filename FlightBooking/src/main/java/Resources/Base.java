package Resources;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public static void initializeDriver(String URL) throws IOException
	{
		
		String browserName = getPropertiesData("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "user.dir\\chromedriver.exe");
			driver.set(new ChromeDriver());
			Base.getDriver().get(URL);
			Base.getDriver().manage().window().maximize();
			Base.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "user.dir\\geckodriver.exe");
			driver.set(new FirefoxDriver());
			Base.getDriver().get(URL);
			Base.getDriver().manage().window().maximize();
			Base.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		else
		{
			System.out.println("unable to invoke driver");
			assertEquals(true, false);
		}
	}
	
	public static String getPropertiesData(String data) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("user.dir\\data\\data.properties");
		prop.load(fis);
		return prop.getProperty(data);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}
}
