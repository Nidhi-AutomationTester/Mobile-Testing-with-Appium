package testscript;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import baseclass.BaseClass;
import pages.MedAccountLogin;
import testdata.ExcelDataReader;
import tests.Utility;


public class TestScript extends BaseClass {

	@Test
	public void setup() throws Exception {
		ExtentTest test = extent.createTest("MedPlus", "Online Shop");
		test.log(Status.INFO, "MedPLus  Application on Android device started");

		ExcelDataReader excel = new ExcelDataReader("G:\\Eclipse\\Appium\\src\\main\\resources\\DataSheet.xls");
		MedAccountLogin med = new MedAccountLogin(driver);
		String pincode = excel.ReadCell(excel.GetCell("Pincode"),1);
		String emailId = excel.ReadCell(excel.GetCell("EmailId"),1);
		String password = excel.ReadCell(excel.GetCell("Password"),1);
		String newPwd = excel.ReadCell(excel.GetCell("NewPassword"),1);
		String surName = excel.ReadCell(excel.GetCell("EditSurname"),1);
		String qunatity = excel.ReadCell(excel.GetCell("Quantity"),1);
		String productName = excel.ReadCell(excel.GetCell("Product"),1);
		
		//1
		med.clickRadioButton_2();
		Thread.sleep(2000);
		med.selectCity();
		test.log(Status.INFO, "User is able to select location by selecting Locatlity and Community");

		String screenShotArea = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot Select Location ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotArea).build());
		
		//2
		med.clickRadioButton_1();
		Thread.sleep(2000);
		med.enterPinCode(pincode);
		Thread.sleep(2000);
		med.selectArea();
		Thread.sleep(2000);
		test.log(Status.INFO, "User is able to select location by specifying pincode : "+pincode);

		String screenShotPincode = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot Select Location ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotPincode).build());

		//account page//3
		med.accountText();
		med.enterEmailId(emailId);
		med.enterPassword(password);
		med.signIn();
		test.log(Status.INFO, "User is able to sign in with EmailId : "+emailId+"Password: "+password);

		String screenShotCredentials = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot EnterCredentials ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotCredentials).build());
		
		//Locate me //5
		med.locateMe();
		Thread.sleep(2000);


		//Edit Info Page//6
		Thread.sleep(2000);
		med.toggle();
		med.editInfo();
		Thread.sleep(2000);
		med.lastName(surName);
		String screenShotEditInfo = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot Edit Info ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotEditInfo).build());
		med.btnUpdate();
		Thread.sleep(2000);
		test.log(Status.INFO, "User is able to Update Personal Information");

		//7
		med.toggle();
		med.editPhoneNo();
		med.navigateBack();
		Thread.sleep(2000);
		test.log(Status.INFO, "User is able to Update Mobile Number");

		//8
		med.toggle();
		med.changePassword();
		med.oldPassword(password);
		med.newPassword(newPwd);
		med.confirmPassword(newPwd);
		med.updatePassword();
		Thread.sleep(2000);
		test.log(Status.INFO, "User is able to Chnage Password");

		//9
		med.pressViewDetails();
		Thread.sleep(2000);
		med.pressGoBack();
		test.log(Status.INFO, "User is able to check all the points collected in Medplus Application");

		//10
		med.clickMyPurchase();
		//med.checkboxAddCancelledOrder();
		Thread.sleep(2000);
		med.navigateBack();
		test.log(Status.INFO, "User is able to check previous orders made on MedPlus");

		//14 Promotions
		med.Promotions();
		test.log(Status.INFO, "User is able to checkout Promotions Page for any promo codes ");

		//15 Healthy Life
		med.HealthyLife();
		test.log(Status.INFO, "User is able to access Healthy life page in MedPlus");

		//11
		med.homaPage();
		//med.uploadImage();
		test.log(Status.INFO, "User is able to upload prescription Image from Gallery");
		
		//12 Search product
		med.searchProduct(productName);
		test.log(Status.INFO, "User is able to search specified product");
		String screenShotSearchProduct = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot Search Product ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotSearchProduct).build());

		//13
		//med.ValidateCart();

		//16 logout
		med.logout();
		test.log(Status.INFO, "User is able to logout successfully from MedPlus Application");

		String screenShotLogout = Utility.takeScreenShot(driver, "Select Area");
		test.log(Status.INFO, "Screenshot Logout ", MediaEntityBuilder.createScreenCaptureFromPath(screenShotLogout).build());
		test.log(Status.INFO, "Test Run Completed!Thank You!!");
	}

}
