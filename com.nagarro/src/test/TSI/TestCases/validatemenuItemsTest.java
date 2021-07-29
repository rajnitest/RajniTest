package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTestCase.BaseClass;
import Pages.FooterPage;
import Pages.HomePage;

public class validatemenuItemsTest extends BaseClass {

	// WebDriverWait wait = new WebDriverWait(driver, 40);

	HomePage h = new HomePage();
	FooterPage f = new FooterPage();
	

	@Test
	public static void validatemenuItemourDifference() {

		Assert.assertEquals(driver.findElement(HomePage.ourdiffmenuitm).getText(), "Our Difference");
	}

	@Test
	public static void validatemenuItemFindagym() {

		Assert.assertEquals(driver.findElement(HomePage.findAgymmenuitm).getText(), "Find a Gym");
	}

	@Test
	public static void validatemenuItemFindaClass() {

		Assert.assertEquals(driver.findElement(HomePage.findAclassmenuitm).getText(), "Find a Class");
	}

	@Test
	public static void validatemenuItemTrainwithus() {

		Assert.assertEquals(driver.findElement(HomePage.trainWithUsmenuitm).getText(), "Train With Us");
	}

	@Test
	public static void validatemenuItemKidsnFamily() {

		Assert.assertEquals(driver.findElement(HomePage.kidsnfamilymenuitm).getText(), "Kids & Family");
	}

	@Test
	public static void validatemenuItemCorporate() {

		Assert.assertEquals(driver.findElement(HomePage.Corporatemenuitm).getText(), "Corporate");
	}

	@Test(dependsOnMethods = {"validatemenuItemTrainwithus"})
	public void clickmenuClick() throws InterruptedException {

		// click on menu items\
		h.clickmenuClick();
	}

}
