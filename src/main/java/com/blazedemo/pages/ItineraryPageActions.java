package com.blazedemo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.clearTrip.pages.locators.ItineraryPageLocators;
import com.clearTrip.utils.SeleniumDriver;
import com.cucumber.listener.Reporter;

import steps.FlightsSearchResults;

public class ItineraryPageActions {
	public static List<String> onWardFlightDetailsItineraryPage=new ArrayList<String>();
	public static List<String> returnFlightDetailsItineraryPage=new ArrayList<String>();
	ItineraryPageLocators itinaryPageloc=null;
	
	public ItineraryPageActions()
	{
		itinaryPageloc=new ItineraryPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), itinaryPageloc);
	}
	
	public void getOnwardJourneyFlightDetails()
	{
		
	}

	public void getReturnJourneyFlightDetails()
	{
		
	}
	
	
	public void verifyItineraryOnWardFlightDetails_With_SearchPageOnwardFlightDetails()
	{
		
	}
	
	public void verifyItineraryReturnFlightDetails_With_SearchPageRetunFlightDetails()
	{
		
	}
	
	
}
