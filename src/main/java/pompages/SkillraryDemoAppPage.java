package pompages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	@FindBy(xpath = "//a[contains(..'ECommerce')]")
	private WebElement pageHeader;
	@FindBy(id ="course")
	private WebElement  courseTab;
	@FindBy(xpath ="//span[@class='wrappers']/a[.='Selenium training']")
	private WebElement seleniumTrainingLink;
	@FindBy( name="addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath ="//a[.='Contact Us']")
	private WebElement contactusLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver){
		PageFactory.initElements(driver ,this);
	}
	//utilization
	public WebElement getPageHeader() {
		return pageHeader;
		
	}
	public void mouseHoverTocourseTab(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickseleniumTraining() {
		seleniumTrainingLink.click();
	}
	public void selectCategory(WebDriverUtility web ,int index) {
		web.dropdown(categoryDropdown, index);
	}
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	public void clickContactUs() {
		contactUsLink.click();
	}
		
	}

