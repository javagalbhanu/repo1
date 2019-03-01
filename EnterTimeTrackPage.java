package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	private final String xp="(//div[contains(text(),'Settings')])[1]";
	@FindBy(xpath=xp)
	private WebElement settings;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings() {
		settings.click();
	}
	
	public void clickLicenses() {
		licenses.click();
	}
}





