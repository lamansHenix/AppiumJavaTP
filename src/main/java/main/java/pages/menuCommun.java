package main.java.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class menuCommun {
AndroidDriver<AndroidElement> driver;
	
	
	//Accueil bouton + XPATH
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.g.v/android.view.ViewGroup/android.widget.ImageButton")
	public MobileElement BoutonPlus;
		

//	//Accueil bouton + ID
//	@AndroidFindBy(id="com.simplemobiletools.contacts:id/fragment_fab")
//	public MobileElement BoutonPlus;
//	
	//Bouton more option menu haut
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"More options\"]")
	public MobileElement BoutonOptionsPoints;
	
	//Bouton confirmer suppression 
	@AndroidFindBy(id="android:id/button1")
	public MobileElement BoutonYesSuppression;
	
	//Menu drop down choix delete
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	public MobileElement DropDownDelete;
		
	
}

