package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.Logout;
import Utilities.DataProvider1;

public class TestCases extends BaseTest{
	
	@Test(dataProvider = "dataset_login", dataProviderClass = DataProvider1.class, description = "Login")
	public void dologin(String username,String password) {
		driver.findElement(By.linkText("Login/Register")).click();
		Login login = new Login(driver);
		login.dolog(username, password);
		Assert.assertTrue(login.varifyresult());
		Logout logout = new Logout(driver);
		logout.hlogount();
	}

}
