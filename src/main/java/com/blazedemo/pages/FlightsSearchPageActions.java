package com.blazedemo.pages.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FlightsSearchPageActions {
	
	FlightsSearchPageLocators flightSearchPageLoc=null;
	
	public FlightsSearchPageActions()
	{
		flightSearchPageLoc=new FlightsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), flightSearchPageLoc);
	}
	
	public void clickonFlights()
	{
		try {
			Thread.sleep(20000);
			flightSearchPageLoc.searchPage_FlightsBtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void enterSourceAs() {
		
    }


    public void enterDestinationAs() {
    	 }
    
    
    public void searchFlights() {
    	
    }

    
    public void wait() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(SeleniumDriver.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement optionListElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("#ui-id-1"));
            }
        });

        
        WebElement originOptionsElement = optionListElement;
        List<WebElement> originOptions = originOptionsElement.findElements(By.tagName("li"));
        originOptions.get(0).click();
    }
    
    
}
