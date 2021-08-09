package TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTestCase.BaseClass;
import Pages.HomePage;

public class HomePageTest extends BaseClass {

	

	public void openwebsite() throws IOException {

		//invokeDriver();

		//Properties prop = new Properties();

		//FileInputStream fis = new FileInputStream("C:/Users/rajnichauhan/eclipse-workspace/com.nagarro/src/test/TSI/config.properties");
		
		//prop.load(fis);
		//String URL = prop.getProperty("url");
		//System.out.print(URL);
		
		
		
		//driver.get(prop.getProperty("url"));
		//driver.get("https://local.newyorksportsclubs.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.findElement(HomePage.crossbtn).click();
	}

	//private void invokeDriver() {
		// TODO Auto-generated method stub
		
	//}

	@Test 
	public void validateTitle() {
		Assert.assertEquals(driver.getTitle(), "New York Sports Clubs | New York's Gym Since 1973. Fitness that Fits.");

	}

	/*
	@Test(dependsOnMethods = { "validateTitle" })
	public void validateBSCregion() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.findElement(HomePage.regionlnk).isDisplayed();
		Thread.sleep(5000);
		driver.findElement(HomePage.regionlnk).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.BSClnk));
		Assert.assertEquals(driver.findElement(HomePage.BSClnk).getText(), "BOSTON SPORTS CLUBS");

	}

	@Test(dependsOnMethods = { "validatePSCregion" })
	public void validateWSCregion() {

		Assert.assertEquals(driver.findElement(HomePage.WSClnk).getText(), "WASHINGTON SPORTS CLUBS");
		driver.findElement(HomePage.regionlnk).click();


	}

	@Test(dependsOnMethods = { "validateBSCregion" })
	public void validatePSCregion() {

		Assert.assertEquals(driver.findElement(HomePage.PSClnk).getText(), "PHILADELPHIA SPORTS CLUBS");

	}

	@Test
	public void validateJoinTodaybtn() {
		String abc = driver.findElement(By.className("user-dropdown.login-dropdown")).getText();
		System.out.print(abc);
	}

	@Test
	public void validateSignInbtn() {
		Assert.assertEquals(driver.findElement(By.xpath("//span[@id='user-dropdown-trigger']")).getText(),"SIGN IN");
		
	}
	*/

}
