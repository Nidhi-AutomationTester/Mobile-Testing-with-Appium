package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String takeScreenShot(WebDriver driver, String screenShotName) throws Exception{

		TakesScreenshot ts =((TakesScreenshot)driver);

		File src=ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";

		File dest=new File(path);

		try {

			FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			System.out.println("Capture failed"+e.getMessage());
		}
		return path;

	}
}
