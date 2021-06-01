# flightBooking
BUGS FOUND on https://blazedemo.com/purchase.php
BUG1)
Name of Passenger Field does not throw any error when we just enter blank spaces in Name field.
In this way, ticket gets generated without Passenger Name on it.

BUG2)
The same message "Your flight from TLV to SFO has been reserved" is displayed on blazedemo.com/purchase.php regardless of whichever flight you book.
For example if user books a flight from Paris airport to Rome OR Boston to London, he will get same message that "Your flight from TLV to SFO has been reserved".


Major Test Cases:
1) User should not be allowed to choose same city in Departure as well as Destination on Blazedemo.com 
2) User should also be allowed to choose destination city first and Departure city next. In this case destination city list should not get disabled.
3) User should not be able to select multiple cities by pressing Ctrl button.
4) User should be able to select cities even if he is not logged into the application.
5) User should be able to use down/up arrow button to traverse between city names in the list box.
6) User should be able to select Departure button and then Destination button with the help of pressing TAB on keyboard.
7) Title of page should be  BlazeDemo.
8) User should see Tick Mark against the city he has selected.
9) If User selects third city in Departure say Boston => goes to Destination=> Now Boston should be displayed in Highlighted text of Departure.
10) User should be able to click Find Flights button.
11) Find Flights button should get clicked even if user presses Tab and Enter on keyboard. He should now land on https://blazedemo.com/reserve.php
12) User should see text like "Flights from São Paolo to Rome:". Verify this has correct city names as selected on previous page.
13) User should not see vice-versa message like  "Flights from Rome to São Paolo:" on reservation page.
14) Verify that 6 columns a)Choose b)Flight# c)Airline d)Departs: São Paolo e)Arrives: Rome f)Price should be displayed.
15) Verify that Choose this flight button is selectable under Choose column.
16) Verify that time of departure/arrival is displayed in AM/PM format. 
17) Hours should not be greater than 12
18) Minutes should not be greater than 60.
19) Verify Departs: São Paolo column displayed correct cityname as booked on page1.
20) Verify Arrives: Rome column displays correct cityname as booked on page1.
21) Verify that all flight prices are displayed with a $ dollar symbol.
22) 
