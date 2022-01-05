package com.step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CucumberOrderIdStep extends BaseClass {

	
	
	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {

		LaunchDriver();
		GetUrl("https://adactinhotelapp.com/");
		
		

		

	}

	@When("user should login with valid credentials {string} {string}")
	public void user_should_login_with_valid_credentials(String username, String password) {

//		 WebElement use = driver.findElement(By.id("username"));
//		 use.sendKeys(username);
//		 WebElement pass = driver.findElement(By.id("password"));
//		 pass.sendKeys(password);
//		 WebElement clk = driver.findElement(By.id("login"));
//		 clk.click();

		LoginPagePro s = new LoginPagePro();
		s.loginpro(username, password);
		
//		EnterText(s.getUsern(), username);
//		EnterText(s.getUserp(), password);
//		ToClick(s.getLog());
		

	}

	@When("click login")
	public void click_login() {

	}

}
