package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class bookflight {

	WebDriver driver ;
	
	@Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Test
    public void blazedemoflow()
    {
    	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    	//Creating an object of ChromeDriver
    	
    	driver.manage().window().maximize();
    	
        String baseUrl = "https://blazedemo.com/";
        String expectedTitle = " BlazeDemo";
        String actualTitle = "";
	    String fromCity="Boston";
	    String toCity="London";

	    /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title is correct; Passed!");
        } else {
            System.out.println("Title is incorrect; Failed");
        }
	    
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        Select departureCity = new Select(driver.findElement(By.name("fromPort")));
        departureCity.selectByVisibleText(fromCity);
        
     
        Select destinationCity = new Select(driver.findElement(By.name("toPort")));
        destinationCity.selectByVisibleText(toCity);
        
	    //test whether departs column on page 2 has correct fromCity in the column header
        
	    String expectedHeaders = String.join( "Departs:",fromCity);
    String visibleHeaders = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/th[3])).getText();

    Assert.assertEquals(visibleHeaders, expectedHeaders);
				    
//test whether arrives column on page 2 has correct fromCity in the column header
        String expectedHeaders = String.join( "Arrives:",toCity);
    String visibleHeaders = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/th[4]).getText();

    Assert.assertEquals(visibleHeaders, expectedHeaders);
							
	//Storing name of airline and flight number to verify on next page
	String flightnum= driver.findElement(By.xpath("//table[@class='table']/tbody/tr[4]/td[2])).getText();	
	String airline = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[4]/td[3])).getText();						      
						      
        //Choosing the flight
        driver.findElement(By.xpath("//table[@class='table']/tbody/tr[4]/td[1]/input")).click();

	String PurchasePageActualTitle = driver.findElement(By.xpath("//div/div/table/tbody/tr/td/h2[@class='container']")).getText();	
	String PurchasePageExpectedTitle = ("Your flight from" + fromCity + "to" + toCity + "has been reserved.");
	Assert.assertEquals(PurchasePageActualTitle, PurchasePageExpectedTitle);
						     
	 Assert.assertEquals(driver.findElement(By.xpath("//div/div/table/tbody/tr/td/[@class='container']/h2/following-sibling::text()[1]")).contains(airline));
	Assert.assertEquals(driver.findElement(By.xpath("//div/div/table/tbody/tr/td/[@class='container']/h2/following-sibling::text()[1]")).contains(flightnum));				     
						     
						     
    	// Fill form
        driver.findElement(By.id("inputName")).sendKeys("FirstName LastName");
        driver.findElement(By.id("address")).sendKeys("123 Beautiful st. Delhi Road");
        driver.findElement(By.id("city")).sendKeys("Jaipur");
        driver.findElement(By.id("state")).sendKeys("Rajasthan");
        driver.findElement(By.id("zipCode")).sendKeys("12345");
        driver.findElement(By.id("creditCardNumber")).sendKeys("1234567887654321");
            driver.findElement(By.id("nameOnCard")).sendKeys("FirstName LastName");

    	// click Purchase
            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


        
       
        
       // driver.close();
       // driver.quit();
       
    }

}
