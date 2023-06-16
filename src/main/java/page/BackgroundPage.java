package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage {

public BackgroundPage(WebDriver driver)	{
	this.driver =driver;
}
WebDriver driver;
//@FindBy(how = How.XPATH,using= "//button[text()='Set SkyBlue Background']") WebElement CLICK_ON_THE_BUTTON1_ELEMENT;
@FindBy(how = How.CSS,using= "button[onclick='myFunctionSky()']") WebElement CLICK_ON_THE_BUTTON1_ELEMENT;	
@FindBy(how = How.CSS,using= "button[onclick='myFunctionWhite()']") WebElement CLICK_ON_THE_BUTTON2_ELEMENT;		

public void clickOnTheButton1() {
	CLICK_ON_THE_BUTTON1_ELEMENT.click();	
}	
	

public void clickOnTheButton2() {
	CLICK_ON_THE_BUTTON2_ELEMENT.click();	
}	

	
	
	
	
	
	
	
	
	
}
