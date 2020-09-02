package test.java;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.pages.AddContactPage;
import main.java.pages.ContactPage;
import main.java.pages.PageAccueilContact;
import main.java.pages.menuCommun;

public class TestContact {
	
	AndroidDriver<AndroidElement> driver;
	PageAccueilContact accueil;
	Alert alert;
	AddContactPage newContact;
	ContactPage detailsContact;
	
	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities DCforContact = new DesiredCapabilities();
		DCforContact.setCapability("platformName", "Android");
		DCforContact.setCapability("deviceName", "Nexus 5X API 27");
		DCforContact.setCapability("app", "src/test/resources/Simple_Contacts_v4.5.0_apkpure.com.apk");
		DCforContact.setCapability("appPackage", "com.simplemobiletools.contacts");
		DCforContact.setCapability("appActivity", "com.simplemobiletools.contacts.activities.MainActivity");
		
		URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(remoteUrl, DCforContact);
	}
	
	@After
	public void tearDown() throws Exception {
		// Suppression du contact créé pour rendre le SUT en l'état
		
		//Instanciation de la page de detail du contact
		detailsContact = new ContactPage(driver);
		//Click sur le bouton "more options"
		detailsContact.BoutonOptionsPoints.click();
		//Click sur le choix "Delete" du menu dropdown
		detailsContact.DropDownDelete.click();
		//Click sur le choix "Yes" de la confirmation de suppression
		detailsContact.BoutonYesSuppression.click();
		Thread.sleep(1000);
		driver.quit();
	}

	
	@Test
	public void testContact1()
	{
	//Accepter les deux pop up d'alert	
	driver.switchTo().alert().accept();
	driver.switchTo().alert().accept();
	
	accueil = new PageAccueilContact(driver);
	//Click sur le bouton "ajouter un contact"
	accueil.BoutonPlus.click();
	
	//Instanciation de la page de nouveau contact
	newContact = new AddContactPage(driver);
	
	//Click dans le champ Nom
	newContact.ChampNom.click();
	//Envoie des infos dans le champ Nom
	newContact.ChampNom.sendKeys("Test1");

	//Click dans le champ Surname
	newContact.ChampSurname.click();
	//Envoie des infos dans le champ Surname
	newContact.ChampSurname.sendKeys("EQL");

	//Click dans le champ Phone
	newContact.ChampPhone.click();
	//Envoie des infos dans le champ Phone
	newContact.ChampPhone.sendKeys("0606060606");
	
	//Click dans le champ Email
	newContact.ChampEmail.click();
	//Envoie des infos dans le champ email
	newContact.ChampEmail.sendKeys("test@eqlautom.com");

	//Click sur le bouton save
	newContact.BouttonSave.click();
	
	//Re instanciation de la page accueil avec le resultat du nouveau contact
	accueil = new PageAccueilContact(driver);
	//Click sur le nouveau contact
	accueil.FirstContact.click();
	
	//Instanciation de la page du contact
	
	detailsContact = new ContactPage(driver);
	
	//Assertions sur le nom du contact 
	assertEquals("Test1",detailsContact.ChampNom.getText());
	
	//Assertions sur le prénom du contact 
	assertEquals("EQL",detailsContact.ChampSurname.getText());
	
	//Assertions sur le numéro de téléphone du contact
	assertEquals("0606060606",detailsContact.ChampPhone.getText());
	
	//Assertions sur le mail du contact
	assertEquals("test@eqlautom.com",detailsContact.ChampEmail.getText());

	
	}
}
