package com.blazedemo.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FlightsSearchPageLocators {
	
	@FindBy(xpath="")
	public WebElement searchPage_FlightsBtn;
	
	@FindBy(how=How.ID,using="RoundTrip")
	public WebElement searchPage_RoundTripRadioBtn;
	
	@FindBy(id="FromTag")
	public WebElement searchPage_FromTag;
		
	@FindBy(id="ToTag")
	public WebElement searchPage_ToTag;
	
	@FindBy(id="DepartTime")
	public WebElement searchPage_DepartTime;
	
	@FindBy(id="ArriveTime")
	public WebElement searchPage_ArriveTime;
	
	
	@FindBy(css="#SearchBtn")
	public WebElement searchPage_SearchBtn;
	

}
