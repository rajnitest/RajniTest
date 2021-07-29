package Pages;

import java.util.List;
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

//import org.openqa.selenium.JavascriptExecutor;
import BaseTestCase.BaseClass;

public class HomePage extends BaseClass {

	public static By crossbtn = By.id("form-notification-close-frontend");
	public static By popUp = By.id("form-notification-promt-wrapper");
	// public static By ourdiffmenuitm = By.linkText("Our Difference");
	public static By ourdiffmenuitm = By.xpath("//a[contains(text(),'Our Difference')]");
	public static By sbmnuitm = By.linkText("Learn More");
	public static By findAgymmenuitm = By.linkText("Find a Gym");
	public static By findAclassmenuitm = By.linkText("Find a Class");
	public static By trainWithUsmenuitm = By.linkText("Train With Us");
	public static By kidsnfamilymenuitm = By.linkText("Kids & Family");
	public static By Corporatemenuitm = By.linkText("Corporate");
	public static By JoinToday = By.cssSelector(
			"#headerLogoNav > div > div.aside > a.button.join-today-btn.primary.short.hidden-md.hidden-sm");
	// public static By loginlnk = By.className("login");

	public static By usernametxt = By.id("retrieve_user_password_username");
	public static By passwordtxt = By.id("password");
	public static By Submitbtn = By.id("_submit");
	public static By login = By.id("user-dropdown-trigger");

	// JavascriptExecutor executor = (JavascriptExecutor) driver;
	// executor.executeScript("argument[0].click();", login);

	public static By regionlnk = By.id("trigger-change-region");
	public static By BSClnk = By.linkText("BOSTON SPORTS CLUBS");
	public static By WSClnk = By.linkText("WASHINGTON SPORTS CLUBS");
	public static By PSClnk = By.linkText("PHILADELPHIA SPORTS CLUBS");
	public static By claimbtn = By.linkText("Claim Free Trial");
	public static By getfreebtn = By.linkText("Get FREE Pass");
	public static By lrnmorebtn = By.linkText("Learn More");
	public static By brwsclassbtn = By.linkText("Browse Classes");
	public static By ourdiffbtn = By.linkText("Our Difference!");
	public static By fndgymbtn = By.linkText("Find a Gym");

	// Notification Pop Up

	public static By notificationPopup = By.id("form-notification-promt-wrapper");
	public static By ongympae = By.linkText("Brooklyn");

	// Join Today locators
	public static By clubdropdown = By.linkText("Pick a home club");

	// Forgot username

	// public static By forgotusernamelnk =
	// By.xpath("//*[@id=\'user-dropdown\']/form/fieldset/div/small[1]/a");

	public static By forgotusernamelnk = By.linkText("Forgot username?");

	public static By email = By.id("retrieve_credentials_email");
	public static By keytag = By.id("retrieve_credentials_key_tag");
	public static By captcha = By.id("recaptcha-anchor");
	public static By submituserNamebtn = By.cssSelector("button[type='submit']");

	// Forgot password
	// public static By forgotpasswordlnk = By.linkText("Forgot password?");

	public static By forgotpasswordlnk = By
			.cssSelector("#user-dropdown > form > fieldset > div > small:nth-child(4) > a");

	// public static By forgotpasswordlnk = By.linkText("Forgot password?");
	public static By forgotpasswordemail = By.id("retrieve_user_password_email");
	public static By firstnametxtbox = By.id("retrieve_user_password_first_name");
	public static By lastnametxtbox = By.id("retrieve_user_password_last_name");
	public static By usernametxtbox = By.id("retrieve_user_password_username");
	public static By forgotpasswordcaptcha = By.className("recaptcha-checkbox-checkmark");

	// Create an Account
	// public static By createaccountlnk = By.linkText("Create an account.");
	// *[@id="user-dropdown"]/footer/a
	public static By createaccountlnk = By.xpath("//*[@id='user-dropdown']/footer/a");
	public static By createaccountFirstname = By.id("app_user_registration_first_name");
	public static By createaccountlastname = By.id("app_user_registration_last_name");
	public static By createaccountMonth = By.id("app_user_registration_date_of_birth_month");
	public static By createaccountDate = By.id("app_user_registration_date_of_birth_day");
	public static By createaccountYear = By.id("app_user_registration_date_of_birth_year");
	public static By createaccountGender = By.id("app_user_registration_gender");
	public static By createaccountAddress = By.id("app_user_registration_address1");
	public static By createaccountCity = By.id("app_user_registration_city");
	public static By createaccountZip = By.id("app_user_registration_zipcode");
	public static By createaccountEmail = By.id("app_user_registration_email");
	public static By createaccountPhoneNo = By.id("app_user_registration_phone");
	public static By createaccountUsername = By.id("app_user_registration_username");
	public static By createaccountPassword = By.id("app_user_registration_password_first");
	public static By createaccountRepeatpassword = By.id("app_user_registration_password_second");
	public static By createaccountlocation = By.id("app_user_registration_location");
	public static By createaccountsubmit = By.xpath("//button[contains(text(),'Create Account')]");

	// Log in Form

	public static By Loginlbl = By.xpath("//div[contains(text(),'Log In')]");
	public static By crossLogin = By.xpath("//a[@id='user-dropdown-close']");
	public static By usernamelbl = By.xpath("//label[contains(text(),'Username')]");
	public static By userNametxtbox = By.xpath("//input[@id='username']");
	public static By passwordlbl = By.xpath("//label[contains(text(),'Password')]");
	public static By passwordtxtbox = By.xpath("//input[@id='password']");
	public static By logInbtn = By.xpath("//input[@id='_submit']");
	public static By newyorkSportsclublbl = By.xpath("//p[contains(text(),' New York Sports Clubs?')]");
	public static By createAccountlink = By.xpath("//a[contains(text(),'Create an account.')]");

	// click on menu items
	public static By ourdiffPage = By.cssSelector("p.our-difference-description.super");
	public static By findagymPage = By.cssSelector("h1.headline.text-center.primary");
	public static By findaClasspage = By.cssSelector("a.link:nth-child(1)");
	public static By trainwithuspage = By.cssSelector("h1.headline");
	public static By kidsnfamilypage = By.cssSelector("h1:nth-child(1)");
	public static By corporatepage = By.cssSelector("h2:nth-child(1)");

	// Join now flow

	public static By dropdownbox = By.id("clubsSearchInput");
	public static By dropdownlist = By.cssSelector("li[class='autocomplete-item'] span.autocomplete-text");
	public static By dropdownlist2 = By.cssSelector("li[class='autocomplete-item club-li'] span");
	public static By createbutton = By.xpath("//button[contains(text(),'Create Account')]");
	public static By emailerrormsg = By
			.xpath("//div[contains(text(),'Your email is invalid. Please select checkbox belo')]");

	// payment card page

	public static By cardname = By.id("x-form-el-ext-comp-1004");
	public static By cardNumber = By.id("x-form-el-ext-comp-1009");
	public static By cardMonth = By.className("x-form-text x-form-field x-form-focus");
	public static By cardYear = By.className("x-form-text x-form-field x-form-invalid x-form-focus");

	public static By cardaddress1 = By.className("x-form-text x-form-field x-form-invalid");
	public static By cardaddress2 = By.className("x-form-text x-form-field");

	public static By submitbutton = By.className("button");
	// user_popup_firstName
	// user_popup_lastName

	// user_popup_email
	// user_popup_phoneNumber

	public static void validatemenuItems() {

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
	}

	public String actualpageTitle, expectedpageTitle;

	public void validateTitle() {
		// TODO Auto-generated method stub
		String actualpageTitle = driver.getTitle();
		String expectedpageTitle = "New York Sports Clubs | New York's Gym Since 1973. Fitness that Fits.";
		// Assert.assertEquals(actualpageTitle, expectedpageTitle);

	}

	public void validateRegion() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);

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
	}

	public void joinFlow() {

		// Join Now flow
		WebDriverWait wait = new WebDriverWait(driver, 40);
		String actualJoinTodaylink = driver.findElement(HomePage.JoinToday).getText();
		String expectedJoinTodaylink = "JOIN TODAY";
		Assert.assertEquals(actualJoinTodaylink, expectedJoinTodaylink);

		driver.findElement(HomePage.JoinToday).click();

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		driver.findElement(HomePage.dropdownbox).click();
		driver.findElement(HomePage.dropdownbox).sendKeys("carm");

		List<WebElement> options = driver.findElements(HomePage.dropdownlist);
		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("Carmel"))

			{

				option.click();

				break;

			}

		}

		List<WebElement> options1 = driver.findElements(HomePage.dropdownlist2);
		for (WebElement option : options1) {
			if (option.getText().equalsIgnoreCase("Carmel")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.cssSelector("button.button.short.block")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,60)");

		// createUser();

		js.executeScript("window.scrollBy(0,80)");

		// driver.findElement(HomePage.createbutton).click();
		// div.error.on Thread.sleep(400);

		// String error_message = driver.findElement(HomePage.emailerrormsg).getText();
		// System.out.print(error_message);

		// driver.switchTo().frame("iframe");
		// driver.findElement(By.cssSelector("div.checkbox.outlined
		// label.control.wrap"));

		// driver.findElement(By.cssSelector("span.indicator")).click(); //
		// driver.findElement(By.cssSelector("div.checkbox.outlined:nth-child(1)")).getText();

		// System.out.print(checkboxmsg);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label.control.wrap")));

		driver.manage().timeouts().implicitlyWait(16000000, TimeUnit.SECONDS);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//legend[contains(text(),'What’s
		// your payment info?')]")));

		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("fieldset.fieldset
		// legend.legend")));
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

	}

	public void createUser() throws InterruptedException {
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
		String generatedEmail = "rajni" + randomNumber + "@mailinator.com";

		driver.findElement(HomePage.createaccountEmail).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountUsername).sendKeys(generatedEmail);

		driver.findElement(HomePage.createaccountPassword).sendKeys("Test@123");
		driver.findElement(HomePage.createaccountRepeatpassword).sendKeys("Test@123");
		// js.executeScript("window.scrollBy(0,80)");
		if (driver.findElement(By.cssSelector("#app_user_registration_location")).isDisplayed()) {
			// driver.findElement(By.cssSelector("#app_user_registration_location")).click();
			Select location = new Select(driver.findElement(By.cssSelector("#app_user_registration_location")));
			location.selectByVisibleText("125th Street Harlem USA");

		}
		driver.findElement(HomePage.createaccountsubmit).click();
		Thread.sleep(1000);
		String invalidEmailvalidation = driver
				.findElement(By.xpath("//div[contains(text(),'Your email is invalid. Please select checkbox belo')]"))
				.getText();

		if (invalidEmailvalidation.contains("Your email is invalid.")) {
			Assert.assertEquals(invalidEmailvalidation,
					"Your email is invalid. Please select checkbox below to confirm.");

			String confirchkbox = driver.findElement(By.xpath(
					"//body/div[1]/main[1]/div[2]/form[2]/div[1]/div[1]/fieldset[3]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]"))
					.getText();
			Assert.assertEquals(confirchkbox, " I hereby confirm that the email provided by me is valid.");
			driver.findElement(By.xpath(
					"//body/div[1]/main[1]/div[2]/form[2]/div[1]/div[1]/fieldset[3]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]"))
					.click();
			driver.findElement(HomePage.createaccountPassword).sendKeys("Test@123");
			driver.findElement(HomePage.createaccountRepeatpassword).sendKeys("Test@123");
			driver.findElement(HomePage.createaccountsubmit).click();
		}
	}

	public void clickmenuClick() throws InterruptedException {

		// click on menu items
		WebDriverWait wait = new WebDriverWait(driver, 40);

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
	}

	
	public void signInClick() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('user-dropdown-trigger').click();");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

}
