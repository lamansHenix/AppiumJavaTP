package main.java.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContactPage extends menuCommun {

AndroidDriver<AndroidElement> driver;
	
	
	//Champ nom
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_first_name")
		public MobileElement ChampNom;
		
	//Champ Surname
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_surname")
		public MobileElement ChampSurname;	
	//Champ Tel
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_number")
		public MobileElement ChampPhone;
	//Champ Email
		@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_email")
		public MobileElement ChampEmail;
		
	//Menu drop down choix delete
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	public MobileElement DropDownDelete;
		
		
	// constructor 
	public ContactPage(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
}
