package com.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePro extends BaseClass {

	public LoginPagePro() {
 
		PageFactory.initElements(driver, this);
	
	}


	@FindBy(id="username")
	private WebElement usern;
	@FindBy(id="password")
	private WebElement userp;
	@FindBy(id="login")
	private WebElement log;
	
	public WebElement getUsern() {
		return usern;
	}
	public WebElement getUserp() {
		return userp;
	}
	public WebElement getLog() {
		return log;
	}
		
	
	public void loginpro(String use,String pass) {

		EnterText(getUsern(), use);
		EnterText(getUserp(), pass);
		ToClick(getLog());
		
	}
	
	
	
	
	
	

}
