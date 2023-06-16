package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
static WebDriver driver;
public static  WebDriver init() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyagupta\\Sept23_cucumber\\FinalProject\\driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}



}
