package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTestCase.BaseClass;
import Pages.FooterPage;

public class FooterSectionTest extends BaseClass {

	@Test
	public void verifyFooter() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rajnichauhan\\eclipse-workspace\\com.nagarro\\src\\test\\java\\TestCases\\config.properties");
		prop.load(fis);
		boolean configvalue = prop.getProperty("tryConfigvalue") != null;
		if (configvalue) {

			Assert.assertEquals(driver.findElement(FooterPage.footertry).getText(),
					"Try us out! Enter your email for a free trial.");
			Boolean footertxt = driver.findElement(FooterPage.footertxtbox).isDisplayed();
			Assert.assertTrue(footertxt);

			Assert.assertEquals(driver.findElement(FooterPage.footerGo).getText(), "GO");
		}
	}

	@Test
	public void verifyFooterAbout() {

		Assert.assertEquals(driver.findElement(FooterPage.abouttxt).getText(), "ABOUT");
	}

	@Test
	public void verifyFooterCorporate() {

		Assert.assertEquals(driver.findElement(FooterPage.ftrcorporatetxt).getText(), "CORPORATE");
	}

	@Test
	public void verifyFooterConnect() {

		Assert.assertEquals(driver.findElement(FooterPage.connecttxt).getText(), "CONNECT");
	}

	@Test
	public void verifyFooterwhoweAre() {

		Assert.assertEquals(driver.findElement(FooterPage.whoWeRtxt).getText(), "Who We Are");
	}

	@Test
	public void verifyFooterclubMemberPolicy() {

		Assert.assertEquals(driver.findElement(FooterPage.clubtxt).getText(), "Club & Membership Policies");
	}

	@Test
	public void verifyFooterFindAclub() {
		Assert.assertEquals(driver.findElement(FooterPage.findAclubtxt).getText(), "Find a Club");
	}

	@Test
	public void verifyFooterFAQ() {
		Assert.assertEquals(driver.findElement(FooterPage.faqtxt).getText(), "FAQ");
	}

	@Test
	public void verifyFooterCorporatewellness() {
		Assert.assertEquals(driver.findElement(FooterPage.corporatetxt).getText(), "Corporate Wellness");
	}

	@Test
	public void verifyFooterPCM() {
		Assert.assertEquals(driver.findElement(FooterPage.privatetxt).getText(), "Private Center Management");
	}

	@Test
	public void verifyFooterInvest() {
		Assert.assertEquals(driver.findElement(FooterPage.investortxt).getText(), "Investor Relations");
	}

	@Test
	public void verifyFooterContactUs() {
		Assert.assertEquals(driver.findElement(FooterPage.contacttxt).getText(), "Contact Us");
	}

	@Test
	public void verifyFooterSpacerental() {
		Assert.assertEquals(driver.findElement(FooterPage.spacetxt).getText(), "Space Rental");
	}

	@Test
	public void verifyFooterCareers() {
		Assert.assertEquals(driver.findElement(FooterPage.careertxt).getText(), "Careers");
	}

}
