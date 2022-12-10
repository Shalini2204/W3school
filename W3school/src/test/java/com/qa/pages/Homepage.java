package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
  WebDriver Driver;
	
	
	@FindBy(xpath="//*[@id=\"w3loginbtn\"]")
	WebElement login;
	public WebElement login() {
	return login;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/div[1]/span/span")
	public
	WebElement signin;
	public WebElement signin() {
	return signin;
	}
	@FindBy(xpath="//*[@id=\"modalusername\"]")
	WebElement gmail;
	public WebElement gmail() {
	return gmail;
	}
	@FindBy(xpath="//*[@id=\"new-password\"]")
	WebElement password;
	public WebElement password() {
	return password;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button")
	WebElement signupbutton;
	public WebElement  signupbutton()
	{
		return  signupbutton;
	}
	@FindBy(xpath="//*[@id=\"modal_first_name\"]")
	WebElement firstname;
	public WebElement  firstname() {
	return firstname;
	}
	@FindBy(xpath="//*[@id=\"modal_last_name\"]")
	WebElement lastname;
	public WebElement  lastname() {
	return lastname ;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[3]/div/button")
	WebElement Continue;
	public WebElement  Continue() {
	return Continue ;
	}
	@FindBy(xpath="//*[@id=\"search2\"]")
	WebElement cs;
	public WebElement  cs() {
	return cs;
	}
	@FindBy(xpath="/html")
	WebElement page;
	public WebElement  page() {
	return page;
	}
	
	
	
	
	public Homepage(WebDriver Driver)
	{
	this.Driver=Driver;
	PageFactory.initElements(Driver,this);
	}
		}