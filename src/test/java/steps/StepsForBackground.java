package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.BackgroundPage;
import page.TestBase;

public class StepsForBackground  {
	WebDriver driver;
	BackgroundPage backgroundPage;
	@Before
	public void runBefore() {
		driver =TestBase.init();	
	 backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}
	@Given("{string} button exists")
	public void button_exists(String set_Skyblue_Background) {
	driver.get("https://techfios.com/test/101/index.php");

	}

	@When("I click on the button1")
	public void i_click_on_the_button1() {
		backgroundPage.clickOnTheButton1();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
	}

	@Given("\"Set SkyWhite Background\"button exists")
	public void set_SkyWhite_Background_button_exists() {
		driver.get("https://techfios.com/test/101/index.php");
	}

	@When("I click on the button2")
	public void i_click_on_the_button2() {
		backgroundPage.clickOnTheButton2();	
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
	}

	

}
