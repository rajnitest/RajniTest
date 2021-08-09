package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTestCase.BaseClass;
import Pages.HomePage;
import Pages.FooterPage;
public class sample extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Properties config;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:pathconfig.properties");
       prop.load(fis);



		//invokeDriver();
		prop.getProperty("driverPath");
		//driver.get("https://local.newyorksportsclubs.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.findElement(HomePage.crossbtn).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		String actualpageTitle = driver.getTitle();
		String expectedpageTitle = "New York Sports Clubs | New York's Gym Since 1973. Fitness that Fits.";
		Assert.assertEquals(actualpageTitle, expectedpageTitle);

		// VALIDATNG MENU ITEMS

		String actualourDiff = driver.findElement(HomePage.ourdiffmenuitm).getText();
		String expectedurDiff = "Our Difference";
		Assert.assertEquals(actualourDiff, expectedurDiff);

		String actualfindGym = driver.findElement(HomePage.findAgymmenuitm).getText();
		String expectedfindGym = "Find a Gym";
		Assert.assertEquals(actualfindGym, expectedfindGym);

		String actualfindClass = driver.findElement(HomePage.findAclassmenuitm).getText();
		String expectedfindClass = "Find a Class";
		Assert.assertEquals(actualfindClass, expectedfindClass);

		String actualtrainwithUs = driver.findElement(HomePage.trainWithUsmenuitm).getText();
		String expectedtrainwithUs = "Train With Us";
		Assert.assertEquals(actualtrainwithUs, expectedtrainwithUs);

		String actualkindsNfamily = driver.findElement(HomePage.kidsnfamilymenuitm).getText();
		String expectedkindsNfamily = "Kids & Family";
		Assert.assertEquals(actualkindsNfamily, expectedkindsNfamily);

		String actualcareer = driver.findElement(HomePage.Corporatemenuitm).getText();
		String expectedcareer = "Corporate";
		Assert.assertEquals(actualcareer, expectedcareer);

		// VALIDATING REGION SECTION
		
		
		driver.findElement(HomePage.regionlnk).isDisplayed();
		Thread.sleep(5000);
		driver.findElement(HomePage.regionlnk).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.BSClnk));

		String actualBSC = driver.findElement(HomePage.BSClnk).getText();
		String expectedBSC = "BOSTON SPORTS CLUBS";
		Assert.assertEquals(actualBSC, expectedBSC);

		String actualWSC = driver.findElement(HomePage.WSClnk).getText();
		String expectedWSC = "WASHINGTON SPORTS CLUBS";
		Assert.assertEquals(actualWSC, expectedWSC);

		String actualPSC = driver.findElement(HomePage.PSClnk).getText();
		String expectedPSC = "PHILADELPHIA SPORTS CLUBS";
		Assert.assertEquals(actualPSC, expectedPSC);

		driver.findElement(HomePage.regionlnk).click();
		

		// Validating Footer
Boolean tryConfigvalue = false;
		if (tryConfigvalue)
		{
			String actualFootertry = driver.findElement(FooterPage.footertry).getText();
			String expectedFootertry = "Try us out! Enter your email for a free trial.";
			Assert.assertEquals(actualFootertry, expectedFootertry);
			Boolean footertxt = driver.findElement(FooterPage.footertxtbox).isDisplayed();
			Assert.assertTrue(footertxt);
			String actualfootergo = driver.findElement(FooterPage.footerGo).getText();
			String expectedfootergo = "GO";
			Assert.assertEquals(actualfootergo, expectedfootergo);
		}

		String actualftrabout = driver.findElement(FooterPage.abouttxt).getText();
		String expectedftrabout = "ABOUT";
		Assert.assertEquals(actualftrabout, expectedftrabout);

		String actualftrcorporate = driver.findElement(FooterPage.ftrcorporatetxt).getText();
		String expectedftrcorporate = "CORPORATE";
		Assert.assertEquals(actualftrcorporate, expectedftrcorporate);

		String actualftrconnect = driver.findElement(FooterPage.connecttxt).getText();
		String expectedftrconnect = "CONNECT";
		Assert.assertEquals(actualftrconnect, expectedftrconnect);

		String actualftrwhower = driver.findElement(FooterPage.whoWeRtxt).getText();
		String expectedftrwhower = "Who We Are";
		Assert.assertEquals(actualftrwhower, expectedftrwhower);

		String actualftrclubtxt = driver.findElement(FooterPage.clubtxt).getText();
		String expectedftrclubtxt = "Club & Membership Policies";
		Assert.assertEquals(actualftrclubtxt, expectedftrclubtxt);

		String actualftrfindclubtxt = driver.findElement(FooterPage.findAclubtxt).getText();
		String expectedftrfindclubtxt = "Find a Club";
		Assert.assertEquals(actualftrfindclubtxt, expectedftrfindclubtxt);

		String actualftrfaq = driver.findElement(FooterPage.faqtxt).getText();
		String expectedftrfaq = "FAQ";
		Assert.assertEquals(actualftrfaq, expectedftrfaq);

		String actualftrcorporate1 = driver.findElement(FooterPage.corporatetxt).getText();
		String expectedftrcorporate1 = "Corporate Wellness";
		Assert.assertEquals(actualftrcorporate1, expectedftrcorporate1);

		String actualftrprivate = driver.findElement(FooterPage.privatetxt).getText();
		String expectedftrprivate = "Private Center Management";
		Assert.assertEquals(actualftrprivate, expectedftrprivate);

		String actualftrinvestor = driver.findElement(FooterPage.investortxt).getText();
		String expectedftrinvestor = "Investor Relations";
		Assert.assertEquals(actualftrinvestor, expectedftrinvestor);

		String actualftrcontact = driver.findElement(FooterPage.contacttxt).getText();
		String expectedftrcontact = "Contact Us";
		Assert.assertEquals(actualftrcontact, expectedftrcontact);

		String actualftrspace = driver.findElement(FooterPage.spacetxt).getText();
		String expectedftrspace = "Space Rental";
		Assert.assertEquals(actualftrspace, expectedftrspace);

		String actualftrcareer = driver.findElement(FooterPage.careertxt).getText();
		String expectedftrcareer = "Careers";
		Assert.assertEquals(actualftrcareer, expectedftrcareer);

		// click on menu items

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(HomePage.ourdiffmenuitm)).build().perform();
		Thread.sleep(500);
		a.moveToElement(driver.findElement(HomePage.ourdiffmenuitm)).click().build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.ourdiffPage));

		String actualourdiffurl = driver.getCurrentUrl();
		System.out.println(actualourdiffurl);
		String expectedourdiffurl = "https://local.newyorksportsclubs.com/our-difference";
		Assert.assertEquals(actualourdiffurl, expectedourdiffurl);

		Thread.sleep(50);
		driver.findElement(HomePage.findAgymmenuitm).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.findagymPage));

		String actualfindagymurl = driver.getCurrentUrl();
		System.out.println(actualfindagymurl);
		String expectedfindagymurl = "https://local.newyorksportsclubs.com/clubs";
		Assert.assertEquals(actualfindagymurl, expectedfindagymurl);

		Thread.sleep(20);
		driver.findElement(HomePage.findAclassmenuitm).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.findaClasspage));

		String actualfindaclassurl = driver.getCurrentUrl();
		System.out.println(actualfindaclassurl);
		String expectedfindaclassurl = "https://local.newyorksportsclubs.com/classes";
		Assert.assertEquals(actualfindaclassurl, expectedfindaclassurl);

		Thread.sleep(50);
		driver.findElement(HomePage.trainWithUsmenuitm).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.trainwithuspage));

		String actualtrainwithusurl = driver.getCurrentUrl();
		System.out.println(actualtrainwithusurl);
		String expectedtrainwithusurl = "https://local.newyorksportsclubs.com/train-with-us";
		Assert.assertEquals(actualtrainwithusurl, expectedtrainwithusurl);

		Thread.sleep(50);
		a.moveToElement(driver.findElement(HomePage.kidsnfamilymenuitm)).build().perform();
		Thread.sleep(50);
		a.moveToElement(driver.findElement(HomePage.kidsnfamilymenuitm)).click().build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.kidsnfamilypage));

		String actualkidsnfamilyurl = driver.getCurrentUrl();
		System.out.println(actualkidsnfamilyurl);
		String expectedkidsnfamilyurl = "https://local.newyorksportsclubs.com/page/kids-and-family-programs";
		Assert.assertEquals(actualkidsnfamilyurl, expectedkidsnfamilyurl);

		Thread.sleep(50);

		a.moveToElement(driver.findElement(HomePage.Corporatemenuitm)).build().perform();
		Thread.sleep(50);
		a.moveToElement(driver.findElement(HomePage.Corporatemenuitm)).click().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.corporatepage));

		String actualcareerurl = driver.getCurrentUrl();
		System.out.println(actualcareerurl);
		String expectedcareerurl = "https://local.newyorksportsclubs.com/corporate-wellness";
		Assert.assertEquals(actualcareerurl, expectedcareerurl);

		// Join Now flow

		String actualJoinTodaylink = driver.findElement(HomePage.JoinToday).getText();
		String expectedJoinTodaylink = "JOIN TODAY";
		Assert.assertEquals(actualJoinTodaylink, expectedJoinTodaylink);

		driver.findElement(HomePage.JoinToday).click();

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		driver.findElement(HomePage.dropdownbox).click();
		driver.findElement(HomePage.dropdownbox).sendKeys("west");

		List<WebElement> options = driver.findElements(HomePage.dropdownlist);
		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("West Hartford"))

			{

				option.click();

				break;

			}

		}

		List<WebElement> options1 = driver.findElements(HomePage.dropdownlist2);
		for (WebElement option : options1) {
			if (option.getText().equalsIgnoreCase("West Hartford")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.cssSelector("button.button.short.block")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,60)");

		driver.findElement(HomePage.createaccountFirstname).sendKeys("Rajni");
		driver.findElement(HomePage.createaccountlastname).sendKeys("Chauhan");
		driver.findElement(HomePage.createaccountMonth).sendKeys("11");
		driver.findElement(HomePage.createaccountDate).sendKeys("11");
		driver.findElement(HomePage.createaccountYear).sendKeys("1993");
		Select drpgender = new Select(driver.findElement(HomePage.createaccountGender));
		drpgender.selectByVisibleText("Male");
		driver.findElement(HomePage.createaccountAddress).sendKeys("F -311");
		driver.findElement(HomePage.createaccountCity).sendKeys("Faridabad");
		driver.findElement(HomePage.createaccountZip).sendKeys("12312");
		driver.findElement(HomePage.createaccountPhoneNo).sendKeys("1234567890");
		Random objGenerator = new Random();
		int randomNumber = objGenerator.nextInt(100);
		String generatedEmail = "rajni" + randomNumber + "@gmail.com";

		driver.findElement(HomePage.createaccountEmail).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountUsername).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountPassword).sendKeys("Test@123");
		driver.findElement(HomePage.createaccountRepeatpassword).sendKeys("Test@123");
		js.executeScript("window.scrollBy(0,80)");

		driver.findElement(HomePage.createbutton).click();
		// div.error.on Thread.sleep(400);

		String error_message = driver.findElement(HomePage.emailerrormsg).getText();
		System.out.print(error_message);

		// driver.switchTo().frame("iframe");
		// driver.findElement(By.cssSelector("div.checkbox.outlined
		// label.control.wrap"));

		// driver.findElement(By.cssSelector("span.indicator")).click(); //
		// driver.findElement(By.cssSelector("div.checkbox.outlined:nth-child(1)")).getText();

		// System.out.print(checkboxmsg);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label.control.wrap")));

		driver.manage().timeouts().implicitlyWait(160000, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("x-form-el-ext-comp-1009")));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("fieldset.fieldset legend.legend")));
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.print(size);
		driver.switchTo().frame("payment-info-iframe");
		// driver.switchTo().frame(3);
		String name_on_card = driver.findElement(By.id("x-form-el-ext-comp-1004")).getText();
		System.out.print(name_on_card);
		driver.findElement(HomePage.cardname).sendKeys("Rajni");

		driver.findElement(HomePage.cardNumber).sendKeys("4111111111111111");

		Select CRmonth = new Select(driver.findElement(HomePage.cardMonth));
		CRmonth.selectByIndex(1);

		Select CRyear = new Select(driver.findElement(HomePage.cardYear));
		CRyear.selectByIndex(1);

		driver.findElement(HomePage.cardaddress1).sendKeys("F 317");

		driver.findElement(HomePage.cardaddress2).sendKeys("S G M Nagar");

		// Mouse hover to menu items

		Actions ab = new Actions(driver);
		ab.moveToElement(driver.findElement(HomePage.ourdiffmenuitm)).build().perform();
		String actualsubMenu = driver.findElement(By.cssSelector("li[class='title']")).getText();
		String expectedsubMenu = "Kids and Family Programs";
		Assert.assertEquals(actualsubMenu, expectedsubMenu);

		String actuallastsubMenu = driver.findElement(By.cssSelector("li[class='last']")).getText();
		String expectedlastsubMenu = "Sports Clubs for Kids";
		Assert.assertEquals(actuallastsubMenu, expectedlastsubMenu);
		ab.moveToElement(driver.findElement(HomePage.kidsnfamilymenuitm)).build().perform();

		// Validate Log in form

		// Forgot userName

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('user-dropdown-trigger').click();");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(HomePage.forgotusernamelnk).click();
		driver.findElement(HomePage.email).sendKeys("jiakhannn@mailinator.com");
		driver.findElement(HomePage.keytag).sendKeys("#0004536219#");
		driver.findElement(HomePage.submituserNamebtn).click();

		// Forgot password

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("document.getElementById('user-dropdown-trigger').click();");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(HomePage.forgotpasswordlnk).click();
		System.out.print("test");
		driver.findElement(HomePage.forgotpasswordemail).sendKeys("jiakhannn@mailinator.com");
		driver.findElement(HomePage.firstnametxtbox).sendKeys("Megha");
		driver.findElement(HomePage.lastnametxtbox).sendKeys("Dawra");
		driver.findElement(HomePage.usernametxt).sendKeys("mdawra");
		driver.findElement(HomePage.submituserNamebtn).click();

		// Validate Log In form
		Thread.sleep(300);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("document.getElementById('user-dropdown-trigger').click();");
		String actualLogin = driver.findElement(HomePage.Loginlbl).getText();
		String expectedLogin = "Log In";
		Assert.assertEquals(actualLogin, expectedLogin);

		Assert.assertTrue(driver.findElement(HomePage.crossbtn).isDisplayed());
		String actualusername = driver.findElement(HomePage.usernamelbl).getText();
		String expectedusername = "USERNAME";
		Assert.assertEquals(actualusername, expectedusername);

		Assert.assertTrue(driver.findElement(HomePage.userNametxtbox).isDisplayed());
		String actualpassword = driver.findElement(HomePage.passwordlbl).getText();
		String expectedpassword = "PASSWORD";
		Assert.assertEquals(actualpassword, expectedpassword);
		Assert.assertTrue(driver.findElement(HomePage.passwordtxtbox).isDisplayed());

		// String actualloginbtn =
		// driver.findElement(By.xpath("//input[@id='_submit']")).getText();
		// String actualloginbtn =(String)
		// jse2.executeScript(driver.findElement(By.xpath("//input[@id='_submit']")).getText());
		// System.out.print(actualloginbtn);
		// String expectedloginbtn = "LOG IN";
		// Assert.assertEquals(actualloginbtn, expectedloginbtn);

		String actualforgetusername = driver.findElement(HomePage.forgotusernamelnk).getText();
		String expectedforgetusername = "Forgot username?";
		Assert.assertEquals(actualforgetusername, expectedforgetusername);

		String actualforgetpasswordname = driver.findElement(HomePage.forgotpasswordlnk).getText();
		String expectedforgetpasswordname = "Forgot password?";
		Assert.assertEquals(actualforgetpasswordname, expectedforgetpasswordname);
		String actualNYSCtext = driver.findElement(By.xpath("//p[contains(text(),' New York Sports Clubs?')]"))
				.getText();
		String expectedNYSCtext = "New to New York Sports Clubs?";
		Assert.assertEquals(actualNYSCtext, expectedNYSCtext);
		String actualcreateaccount = driver.findElement(By.xpath("//a[contains(text(),'Create an account.')]"))
				.getText();
		String expectedcreateaccount = "Create an account.";

		// Create an account
		// createAccount();

		// Book a class

		// Agreement purchase from club detail page

		// Contact us form

		/*
		 * for(int i=0; i<=20; i++) { invokeDriver();
		 * driver.get("https://local.newyorksportsclubs.com/contact-us/-/bay-ridge");
		 * driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		 * 
		 * //driver.findElement(HomePage.crossbtn).click(); Select dropdown = new
		 * Select(driver.findElement(By.id("contact_us_subject")));
		 * System.out.print("abc"); dropdown.selectByVisibleText("Babysitting");
		 * 
		 * Select dropdown2 = new
		 * Select(driver.findElement(By.id("contact_us_feedback")));
		 * 
		 * dropdown2.selectByVisibleText("Positive");
		 * 
		 * driver.findElement(By.id("contact_us_comments")).sendKeys("test");
		 * driver.findElement(By.id("contact_us_first_name")).sendKeys("Rajni");
		 * driver.findElement(By.id("contact_us_last_name")).sendKeys("chauhan");
		 * driver.findElement(By.id("contact_us_email")).sendKeys(
		 * "chauhan.rajni08@gmail.com");
		 * driver.findElement(By.id("contact_us_phone")).sendKeys("8787878787");
		 * //driver.findElement(By.className("button")).click(); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,500)");
		 * //String aa= driver.findElement(By.cssSelector("input.button")).getText();
		 * //System.out.print(aa);
		 * 
		 * //JavascriptExecutor executor = (JavascriptExecutor) driver; //
		 * executor.executeScript("argument[0].click();", HomePage.submitbutton);
		 * driver.findElement(By.
		 * cssSelector("form[name='contact_us'] input.button[type='submit']")).click();
		 * 
		 * }
		 * 
		 */

		//createAccount();
		
		// private static void createAccount() {
		// TODO Auto-generated method stub
		// JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		// jse4.executeScript("document.getElementById('user-dropdown-trigger').click();");
		// driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

		/*
		driver.findElement(By.xpath("//a[contains(text(),'Create an account.')]")).click();

		// Thread.sleep(800);
		driver.findElement(HomePage.createaccountFirstname).sendKeys("Rajni");
		driver.findElement(HomePage.createaccountlastname).sendKeys("Chauhan");
		driver.findElement(HomePage.createaccountMonth).sendKeys("11");
		driver.findElement(HomePage.createaccountDate).sendKeys("11");
		driver.findElement(HomePage.createaccountYear).sendKeys("1993");
		Select drpdowngender = new Select(driver.findElement(HomePage.createaccountGender));
		drpdowngender.selectByVisibleText("Male");
		driver.findElement(HomePage.createaccountAddress).sendKeys("F -311");
		driver.findElement(HomePage.createaccountCity).sendKeys("Faridabad");
		driver.findElement(HomePage.createaccountZip).sendKeys("12312");
		driver.findElement(HomePage.createaccountPhoneNo).sendKeys("1234567890");

		Random objGenerator = new Random();

		int randomNumber = objGenerator.nextInt(100);
		String generatedEmail = "rajni" + randomNumber + "@gmail.com";
		driver.findElement(HomePage.createaccountEmail).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountUsername).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountPassword).sendKeys("Test@123");
		driver.findElement(HomePage.createaccountRepeatpassword).sendKeys("Test@123");
		// js.executeScript("window.scrollBy(0,80)");

		driver.findElement(HomePage.createaccountsubmit).click();
*/
	}

}
	
	//public static void createAccount() {
	//}
	



// questions ::1. Not able to enter in payment iframe.
// 2. Not able to click on Log in button
// 3. Not able to click on check box while create account in case of invalid email id 
// 4. Not able to create a user defined function 
