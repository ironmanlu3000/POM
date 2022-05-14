package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
  
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement uName;

	@FindBy(id = "password")
	WebElement uPass;

	@FindBy(name = "login")
	WebElement Login;
	
	public void dolog(String userName,String userPass) {
		username(userName);
		password(userPass);
		Login1();	
	}

	public void username(String userName) {
		uName.sendKeys(userName);
	}

	public void password(String userPass) {
		uPass.sendKeys(userPass);
	}

	public Logout Login1() {
		Login.click();
		return new Logout(driver);
	}
	
	public boolean varifyresult() {
		return Gettitle().equalsIgnoreCase("REETREE - Your Online Shopping Hub | My Account");
	}
	public String Gettitle() {
		return driver.getTitle();
	}
}
