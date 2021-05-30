package com.blazedemo.pages.locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.clearTrip.utils.SeleniumDriver;

public class FlightSearchResultsPageLocators {
	
	@FindBy(xpath="//div[@class='colZero leg col12']//ul[@class='listView flights']")
	public WebElement SearchResults_FromFlightsListView;
	
	@FindBy(xpath="//div[@class='colZero leg col12 last']//ul[@class='listView flights']")
	public WebElement SearchResults_ReturnFlightsListView;
	
	@FindBy(how=How.XPATH,using="(//*[@type='submit' and text()='Book'])[2]")
	public WebElement SearchResults_BookTicket;
	
	
	

}
