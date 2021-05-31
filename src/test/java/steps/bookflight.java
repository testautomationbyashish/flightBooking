package stepdefs;

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

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        Select departureCity = new Select(driver.findElement(By.name("fromPort")));
        departureCity.selectByVisibleText("Boston");
        
     
        Select destinationCity = new Select(driver.findElement(By.name("toPort")));
        destinationCity.selectByVisibleText("London");
        
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        
        driver.findElement(By.xpath("//table[@class='table']/tbody/tr[4]/td[1]/input")).click();

    	// Fill form
        driver.findElement(By.id("inputName")).sendKeys("FirstName LastName");
        driver.findElement(By.id("address")).sendKeys("123 Beautiful st.");
        driver.findElement(By.id("city")).sendKeys("Santa Clara");
        driver.findElement(By.id("state")).sendKeys("CA");
        driver.findElement(By.id("zipCode")).sendKeys("12345");
        driver.findElement(By.id("creditCardNumber")).sendKeys("1234 5678 8765 4321");
            driver.findElement(By.id("nameOnCard")).sendKeys("FirstName LastName");

    	// click Purchase
            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title is correct; Passed!");
        } else {
            System.out.println("Title is incorrect; Failed");
        }
       
        
       // driver.close();
       // driver.quit();
       
    }

}
