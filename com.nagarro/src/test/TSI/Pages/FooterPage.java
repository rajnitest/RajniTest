package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseTestCase.BaseClass;

public class FooterPage extends BaseClass{




	public static By footertry = By.className("footer-tryEmailForm-label");
	public static By footertxtbox = By.id("tryEmailId");
	public static By footerGo = By.cssSelector("#emailForTry > button");	
	
	
	public static By abouttxt = By.xpath("//*[@id=\'footer\']/div/div[1]/div/div/div[3]/ul/li[1]");	
	public static By ftrcorporatetxt = By.xpath("//*[@id=\'footer\']/div/div[1]/div/div/div[4]/ul/li[1]");		
	public static By connecttxt = By.xpath("//*[@id=\'footer\']/div/div[1]/div/div/div[5]/ul/li[1]");
	
	
	public static By whoWeRtxt = By.linkText("Who We Are");
	public static By clubtxt = By.linkText("Club & Membership Policies");
	public static By findAclubtxt = By.linkText("Find a Club");
	public static By faqtxt = By.linkText("FAQ");
	public static By corporatetxt = By.linkText("Corporate Wellness");
	public static By privatetxt = By.linkText("Private Center Management");
	public static By investortxt = By.linkText("Investor Relations");
	public static By contacttxt = By.linkText("Contact Us");
	public static By spacetxt = By.linkText("Space Rental");	
	public static By careertxt = By.linkText("Careers");

   


	public void validateFooter()  {
		    
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
		  }




	





}


















