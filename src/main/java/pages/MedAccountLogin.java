package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class MedAccountLogin extends TestBase {
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Account']")
	private AndroidElement txtAccount;

	@AndroidFindBy(xpath = "//android.view.View[@text='Home']")
	private AndroidElement txtHome;

	@AndroidFindBy(xpath = "//android.view.View[@text='Promotions']")
	private AndroidElement txtPromotions;

	@AndroidFindBy(xpath = "//android.view.View[@text='Healthy Life']")
	private AndroidElement txtHealthyLife;

	//Search Area
	//@AndroidFindBy(xpath = "//div[@class='_highlighter-box_619e8'][14]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]")
	private AndroidElement radioButton1;

	//@AndroidFindBy(xpath = "//div[contains(@class, '_highlighter-box_619e8')][16]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]")
	private AndroidElement radioButton2;

	@AndroidFindBy(className = "android.widget.EditText")
	private AndroidElement txtPincode;

	//@AndroidFindBy(xpath = "//*[@text=‘411057’]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]")
	private AndroidElement selectArea;

	@AndroidFindBy(xpath = "//android.view.View[@text='back']")
	private AndroidElement navigateBack;

	//Login Screen
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
	private AndroidElement txtEmailId;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	private AndroidElement txtPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign In']")
	private AndroidElement btnSignIn;

	//MyAccount

	@AndroidFindBy(xpath = "//android.view.View[@text='Nidhi Sharma']")
	private AndroidElement validateUserName;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Change']")
	private AndroidElement changeAddress;


	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private AndroidElement allowPopUp;

	//@AndroidFindBy(id = "com.medplus.mobile.android:id/dropDowntoggle")
	//@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id,'dropDowntoggle']")
	@AndroidFindBy(className = "android.widget.Spinner")
	private AndroidElement drpdnToggle;

	@AndroidFindBy(xpath = "//android.view.MenuItem[@text='Edit Personal Info']")
	private AndroidElement editInfo;

	@AndroidFindBy(xpath = "//android.view.MenuItem[@text='Change Phone number']")
	private AndroidElement editPhoneNo;

	@AndroidFindBy(xpath = "//android.view.MenuItem[@text='Change Password']")
	private AndroidElement changePassword;

	//Edit Info
	//@AndroidFindBy(xpath = "//android.widget.EditText[@id='lastname']")
	//@AndroidFindBy(id = "com.medplus.mobile.android:id/lastname")
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	private AndroidElement txtLastName;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Update']")
	private AndroidElement btnUpdate;

	//Edit Phone Number
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='phonenumber']")
	private AndroidElement txtPhoneNumber;

	//Update Password
	//@AndroidFindBy(xpath = "//android.widget.EditText[@id='oldPassword']")
	//@AndroidFindBy(id = "com.medplus.mobile.android:id/oldPassword")
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	private AndroidElement txtOldPassword;

	//@AndroidFindBy(xpath = "//android.widget.EditText[@id='password']")
	//@AndroidFindBy(id = "com.medplus.mobile.android:id/password")
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	private AndroidElement txtNewPassword;

	//@AndroidFindBy(xpath = "//android.widget.EditText[@id='confirmPwd']")
	//@AndroidFindBy(id = "com.medplus.mobile.android:id/confirmPwd")
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	private AndroidElement txtConfirmPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Change Password']")
	private AndroidElement btnUpdatePassword;

	//View Details
	@AndroidFindBy(xpath = "//android.widget.Button[@text='View Details']")
	private AndroidElement btnViewDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Go Back']")
	private AndroidElement btnGoBack;


	@AndroidFindBy(xpath = "//android.view.View[@text='My Purchases My Purchases']")
	private AndroidElement txtMyPurchase;


	@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Include Cancelled Order']")
	private AndroidElement checkboxAddCancelledOrder;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Select City']")
	private AndroidElement selectCity;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Close']")
	private AndroidElement closeCity;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Locate me']")
	private AndroidElement locateMe;

	//Prescription Uploading
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ui.png']")
	private AndroidElement selectImage;

	@AndroidFindBy(xpath = "//android.view.View[@text='Select a prescription from Gallery']")
	private AndroidElement selectFromGallery;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='UPLOAD']")
	private AndroidElement uploadImage;

	//Search Product
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View")
	private AndroidElement searchWindow;

	@AndroidFindBy(className = "android.widget.EditText")
	private AndroidElement searchBox;

	@AndroidFindBy(xpath = "//android.view.View[@text='BOOST BOTTLE 500GM']")
	private AndroidElement boostBottle;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='GLAXOSMITHKLINE CONSUMER HEALTHCARE LTD\r\n" + 
			"']")
	private AndroidElement add;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	private AndroidElement addToCart;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='500 grams']")
	private AndroidElement quantity;

	@AndroidFindBy(className = "android.app.Dialog")
	private AndroidElement addProductQuantity;

	@AndroidFindBy(xpath = "//android.view.View[@text='1']")
	private AndroidElement clickCart;

	//Logout
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Logout']")
	private AndroidElement logout;


	public MedAccountLogin(AppiumDriver<MobileElement> driver) {
		super(driver);
	}


	public void accountText(){
		txtAccount.click();

	}

	public void clickRadioButton_1(){
		radioButton1.click();

	}
	public void clickRadioButton_2(){
		radioButton2.click();

	}
	public void enterPinCode(String pincode) {
		txtPincode.click();
		System.out.println("Pincode is: "+pincode);
		txtPincode.sendKeys(pincode);
	}
	public void selectArea() {
		selectArea.click();
	}

	public void navigateBack() {
		navigateBack.click();
	}

	public void enterEmailId(String emailId) {
		txtEmailId.sendKeys(emailId);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void signIn() {
		btnSignIn.click();
	}

	public void toggle() {
		drpdnToggle.click();
	}
	public void editInfo() {
		editInfo.click();
	}

	public void editPhoneNo() {
		editPhoneNo.click();
	}

	public void changePassword() {
		changePassword.click();
	}

	public void lastName(String surname) throws InterruptedException {
		txtLastName.sendKeys(surname);
	}

	public void btnUpdate() {
		/* AndroidElement paymentApp = (AndroidElement) (driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()."
						+ "scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Update\")"
						+ ".instance(0))");*/
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Update\"));"));

		/*TouchActions action = new TouchActions(driver);
	    	 action.scroll(btnUpdate, 10,100);
	    	 action.perform();*/
		btnUpdate.click();
	}

	public void updatePhoneNumber() {
		txtPhoneNumber.click();
	}

	public void oldPassword(String password) {
		txtOldPassword.sendKeys(password);
	}
	public void newPassword(String password) {
		txtNewPassword.sendKeys(password);
	}

	public void confirmPassword(String password) {
		txtConfirmPassword.sendKeys(password);
	}

	public void updatePassword() {
		btnUpdatePassword.click();
	}

	public void pressViewDetails() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"View Details\"));"));
		btnViewDetails.click();
	}

	public void pressGoBack() {
		btnGoBack.click();
	}

	public void clickMyPurchase() {
		txtMyPurchase.click();
	}

	public void checkboxAddCancelledOrder() {
		checkboxAddCancelledOrder.click();
	}


	public void selectCity() throws InterruptedException {
		selectCity.click();
		Thread.sleep(2000);
		closeCity.click();
	}

	public void locateMe() {
		changeAddress.click();
		locateMe.click();
		allowPopUp.click();
	}

	//Home 
	public void homaPage() {
		txtHome.click();
	}

	//Upload Prescription
	public void uploadImage() {
		uploadImage.click();
		selectFromGallery.click();	    	 
		selectImage.click();
		navigateBack.click();
	}

	public void searchProduct(String productName) throws InterruptedException {
		searchWindow.click();
		searchBox.sendKeys(productName);
		Thread.sleep(2000);
		//add.click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"500 grams\"));"));
		//quantity.click();
		//addToCart.click();
		//addProductQuantity.click();
		//navigateBack.click();
		navigateBack.click();
	}

	/*public void ValidateCart() {
		clickCart.click();
		navigateBack.click();
		navigateBack.click();
		navigateBack.click();
		navigateBack.click();
		navigateBack.click();
	}*/

	public void Promotions() throws InterruptedException {
		txtPromotions.click();
		Thread.sleep(2000);
	}

	public void HealthyLife() throws InterruptedException {
		txtHealthyLife.click();
		Thread.sleep(2000);
	}

	public void logout() {
		txtAccount.click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Logout\"));")); 
		logout.click();
	}

}
