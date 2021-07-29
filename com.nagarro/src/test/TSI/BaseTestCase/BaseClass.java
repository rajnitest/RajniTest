package BaseTestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver = null;

	public static void browserLaunch() throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\rajnichauhan\\Desktop\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajnichauhan\\Documents\\Marksheet\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		FileInputStream fis = new FileInputStream("/com.nagarro/src/test/TSI/Config.properties");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		prop.load(fis);

		System.out.println(prop.getProperty("baseUrl"));

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseUrl"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

}
