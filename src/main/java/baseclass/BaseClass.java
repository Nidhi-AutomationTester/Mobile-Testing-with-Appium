package baseclass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.ExtentReportClass;

public class BaseClass extends ExtentReportClass{

	public static AppiumDriver<MobileElement> driver;
	@BeforeTest
	@Parameters({"deviceName", "platformVersion","url"})
	public void setup(String deviceName,String platformVersion,String url) throws InterruptedException, MalformedURLException
	{

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/MedPlus/");
		File app = new File(appDir, "MedPlus_com.medplus.mobile.android.apk");


		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("resetKeyboard", true);
		cap.setCapability("appActivity", "com.medplus.mobile.android.MainActivity");
		cap.setCapability("appPackage", "com.medplus.mobile.android");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("platformVersion", platformVersion);
		driver=new AppiumDriver<MobileElement>(new URL(url), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}

}
