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


public class PageAccueilContact extends menuCommun {

	AndroidDriver<AndroidElement> driver;
	
	
	//Accueil bouton + XPATH
//	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.g.v/android.view.ViewGroup/android.widget.ImageButton")
//	public MobileElement BoutonPlus;
//		

	//Premier contact de la liste
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_holder")
	public MobileElement FirstContact;
	
	// constructor 
	
	public PageAccueilContact(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
}
