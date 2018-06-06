package apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

import utils.DriverFactory;

public class WhatsappTest extends DriverFactory {
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	
	public WhatsappTest() {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
	}
	
	@BeforeMethod
	public void setup() {
		driver = getDriver();
		driver.get("https://web.whatsapp.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		try {
			if(driver != null) {
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDown, Exception: " + e.getMessage());
			
					
		}
}
	
	
	@Test
public void findUserAndSendMessage() {
		this.wait.until((Predicate<WebDriver>) ExpectedConditions.titleContains("WhatsApp"));
		System.out.println("page loaded.");
		driver.findElement(By.xpath("test"));
		
	}
}
