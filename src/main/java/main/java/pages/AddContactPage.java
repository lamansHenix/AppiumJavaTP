package main.java.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;


	public class AddContactPage extends menuCommun {

		AndroidDriver<AndroidElement> driver;
		
	
		//Champ nom
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_first_name")
		//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.EditText[1]")
		public MobileElement ChampNom;
		
		//Champ Email
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_email")
		public MobileElement ChampEmail;
		
		//Champ Surname
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_surname")
		public MobileElement ChampSurname;
				
		//Champ Phone
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_number")
		public MobileElement ChampPhone;
		
		//BoutonSave
		@AndroidFindBy(id="save")
		public MobileElement BouttonSave;
		
		
		// constructor 
		
		public AddContactPage(AndroidDriver<AndroidElement> driver) {
			this.driver =  driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		
	}


