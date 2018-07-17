package deltaXOnline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Methods {
	static RemoteWebDriver driver;
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adjiva.com/qa-test/");
	}

	public void firstName(String locator, String Value) {

		driver.findElementByName(locator).sendKeys(Value);
	}

	public void lastName(String locator, String Value) {

		driver.findElementByName(locator).sendKeys(Value);
	}

	public void department(String locator, int i) {
		WebElement ele = driver.findElementByName(locator);
		Select dropDown=new Select(ele);
		dropDown.selectByIndex(i);
	}

	public void userName(String locator, String Value) {
		driver.findElementByName(locator).sendKeys(Value);
	}
	
	public void passWord(String locator, String Value) {
		driver.findElementByName(locator).sendKeys(Value);
	}
	
	public void cnfPassWord(String locator, String Value) {
		driver.findElementByName(locator).sendKeys(Value);
	}
	
	public void email(String locator, String Value) {
		driver.findElementByName(locator).sendKeys(Value);
	}
	public void mobile(String locator, String Value) {
		driver.findElementByName(locator).sendKeys(Value);
	}
	public void click( String locator) {
		WebElement ele = driver.findElementByClassName(locator);
		ele.click();
	}

}
