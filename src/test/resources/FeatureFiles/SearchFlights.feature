Feature: Blazedemo Acceptance testing.
  In order to book the tickets verify that blazedemo page is loading and user is able to book the tickets.
  

  
  Scenario Outline: Validate ticketBooking
    Given User logins on Blazedemo with "email" and "password"
    When User is on the Home Page "https://blazedemo.com" of blazedemo Website
    Then User selects Departure City <From>
    And User selects Destination City <To>
    And User Clicks on Find Flights button
    Then User lands on "https://blazedemo.com/reserve.php" page
    And Verify page title is "Flights from" <From> to <To>
    And Verify Departs column name is "Departs:" <From>
    And Verify Arrives column name is "Arrives:" <To>
    And User clicks on Choose this flight button
    Then Verify user is redirected to "https://blazedemo.com/purchase.php" page
    And Verify Airline name is same as on reservation page
    And Verify Flight number is same as on reservation page
    And Verify Price is same as on reservation page
    And Verify Total Cost is sum of Arbitrary Fees and Taxes and Price
    And Verify if Only Blank spaces are given in name field error should be thrown
    And Verify if Only Blank spaces are given in Address field error should be thrown
    And Verify if Only Blank spaces are given in City field error should be thrown
    And Verify if Only Blank spaces are given in State field error should be thrown
    And Verify if Only Blank spaces are given in Zipcode field error should be thrown
    And Verify User is able to select card type from list box
    And Verify if user enters alphabets in credit card number error should be thrown
    And Verify credit card month can only be between 1 and 12 
    And Verfy credit card month/year is greater than equal to current date
    And Verify if Only Blank spaces are given in Name on Card field error should be thrown
    And Verify user is able to check Remember Me
    And Verify user is able to Click Purchase Flight Button
    Then Verify user is landed to "https://blazedemo.com/confirmation.php" page
    And Verify confirmation message is dislayed
    
    
    Examples:  
    |  From    			|  To   			 |
    | "Paris"     	| "Buenos Aires"        |
   
