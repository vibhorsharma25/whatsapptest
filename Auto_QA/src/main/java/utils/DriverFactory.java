package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
	public static WebDriver driver;

	public WebDriver getDriver() {
		try {
			// Read Config
//			Properties p = new Properties();
//			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
//			p.load(fi);
//			String browserName = p.getProperty("browser");
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			//contactUsPage = PageFactory.initElements(driver, ContactUs_Page.class);
			//productsPage = PageFactory.initElements(driver, Products_Page.class);
		}
		return driver;
	}
}
