package TestCases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseTestCase.BaseClass;
import Pages.HomePage;

public class CreateAccountTest extends BaseClass {

	private static final JavascriptExecutor JavascriptExecutor = null;
	HomePage h = new HomePage();
	
/*
	@Test(dependsOnMethods = { "createAccount" })
	public void joinFlow() {

		// Join Now flow
		h.joinFlow();

	}*/

	
	

	@Test
	public void createAccount() throws InterruptedException {
      Thread.sleep(3000);
		h.signInClick();

		driver.findElement(By.xpath("//a[contains(text(),'Create an account.')]")).click();

		// Thread.sleep(800);
		h.createUser();

		

	}
/*
	@Test(dependsOnMethods = { "validateLogInForm" })
	public void forgotusername() throws InterruptedException {

		h.signInClick();

		driver.findElement(HomePage.forgotusernamelnk).click();
		Thread.sleep(400);
		driver.findElement(HomePage.email).sendKeys("jassi@mailinator.com");
		driver.findElement(HomePage.keytag).sendKeys("jassi#");
		driver.findElement(HomePage.submituserNamebtn).click();

	}

	@Test(dependsOnMethods = { "forgotusername" })
	public void forgotPassword() throws InterruptedException {

		h.signInClick();

		driver.findElement(HomePage.forgotpasswordlnk).click();
		Thread.sleep(400);
		driver.findElement(HomePage.forgotpasswordemail).sendKeys("jiakhannn@mailinator.com");
		driver.findElement(HomePage.firstnametxtbox).sendKeys("Megha");
		driver.findElement(HomePage.lastnametxtbox).sendKeys("Dawra");
		driver.findElement(HomePage.usernametxt).sendKeys("mdawra");
		driver.findElement(HomePage.submituserNamebtn).click();
	}

	@Test
	public void createAccountusingKeytag() {

	}

	@Test
	public void validateLogInForm() throws InterruptedException {

		Thread.sleep(300);
		h.signInClick();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(HomePage.Loginlbl).getText(), "Log In");

		Assert.assertTrue(driver.findElement(HomePage.crossLogin).isDisplayed());

		Assert.assertEquals(driver.findElement(HomePage.usernamelbl).getText(), "USERNAME");

		Assert.assertTrue(driver.findElement(HomePage.userNametxtbox).isDisplayed());

		Assert.assertEquals(driver.findElement(HomePage.passwordlbl).getText(), "PASSWORD");
		Assert.assertTrue(driver.findElement(HomePage.passwordtxtbox).isDisplayed());

		String actualloginbtn = driver.findElement(HomePage.logInbtn).getAttribute("value");

		Assert.assertEquals(actualloginbtn.toUpperCase(), "LOG IN");

		Assert.assertEquals(driver.findElement(HomePage.forgotusernamelnk).getText(), "Forgot username?");

		Assert.assertEquals(driver.findElement(HomePage.forgotpasswordlnk).getText(), "Forgot password?");

		Assert.assertEquals(driver.findElement(HomePage.newyorkSportsclublbl).getText(),
				"New to New York Sports Clubs?");

		Assert.assertEquals(driver.findElement(HomePage.createAccountlink).getText(), "Create an account.");

	}

	@Test(dependsOnMethods = { "forgotPassword" })
	public void logIn() {
		h.signInClick();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mdawra");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@id='_submit']")).click();

	}

	@Test(dependsOnMethods = { "logIn" })
	public void logOut() {
		driver.findElement(By.xpath("//a[@id='user-dropdown-trigger']")).click();

		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
	*/
}
