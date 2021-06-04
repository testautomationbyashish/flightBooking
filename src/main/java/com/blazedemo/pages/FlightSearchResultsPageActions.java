package com.blazedemo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.pages.locators.FlightSearchResultsPageLocators;
import com.blazedemo.pages.locators.FlightsSearchPageLocators;
import com.blazedemo.utils.CommonMethods;
import com.blazedemo.utils.SeleniumDriver;
import com.cucumber.listener.Reporter;

public class FlightSearchResultsPageActions {
	
	FlightSearchResultsPageLocators flightSearchResultsPageLoc=null;
	
	public  FlightSearchResultsPageActions()
	{
		flightSearchResultsPageLoc=new FlightSearchResultsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), flightSearchResultsPageLoc);
	}
	
	public WebElement getDepartureFlightsList()
	{
		return flightSearchResultsPageLoc.SearchResults_FromFlightsListView;
	}
	
	public WebElement getReturnFlightsList()
	{
		return flightSearchResultsPageLoc.SearchResults_ReturnFlightsListView;
	}
	
	public void clickBookTikcetsButton()
	{
		new CommonMethods().presenceOfTheElement(flightSearchResultsPageLoc.SearchResults_BookTicket).click();
		
	}
	
	public void clickToChooseDeparture_ReturnFlights()
	{
		
        
	}
	
	
	
	

        return flightData;

    }

}
