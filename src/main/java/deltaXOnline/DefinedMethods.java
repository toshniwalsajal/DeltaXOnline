package deltaXOnline;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DefinedMethods extends Methods {
	
	@Test(priority=0)
	public void startApp() {
		super.startApp();
	}
	
	@Test(priority=1)
	public void firstName() {
		// TODO Auto-generated method stub
		super.firstName("first_name", "sajal");
	}
	
	@Test(priority=2)
	public void lastName() {
		// TODO Auto-generated method stub
		super.lastName("last_name", "toshniwal");
	}
	@Test(priority=3)
	public void department() {
		// TODO Auto-generated method stub
		super.department("department", 1);
	}
	@Test(priority=4)
	public void userName() {
		// TODO Auto-generated method stub
		super.userName("user_name", "toshniwal.sajal");
	}
	@Test(priority=5)
	public void passWord() {
		// TODO Auto-generated method stub
		super.passWord("user_password", "Abcd@123");
	}
	@Test(priority=6)
	public void cnfPassWord() {
		// TODO Auto-generated method stub
		super.cnfPassWord("confirm_password", "Abcd@123");
	}
	@Test(priority=7)
	public void email() {
		// TODO Auto-generated method stub
		super.email("email", "toshniwal.sajal@gmail.com");
	}
	
	@Test(priority=8)
	public void mobile() {
		// TODO Auto-generated method stub
		super.mobile("contact_no", "1234567890");
	}
	@Test(priority=9)
	public void click() {
		// TODO Auto-generated method stub
		super.click("btn btn-warning");
	}
	
	
}
