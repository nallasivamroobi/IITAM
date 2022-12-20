Feature: Adactin hotel Booking

Scenario: Login to the home page
         Given Enter in to home page
         And enter username and password
         Then record the result
         
Scenario:  Search Hotel
           Then Select Location name from dropDown
           Then Select Hotel name from dropDown
           Then Select Room type from dropDown
           Then Select number of rooms from dropDown
           Then Enter Check in Date
           Then Enter check out date
           Then select adults per room from drop down
           Then select children per room from drop down
           And click search button
           
Scenario:  Selecting Hotel
           Given selecting hotel
           Then  Continue the process
           
Scenario:  Book a Hotel
            Given Enter Personal details
            Then Give card details
            And Book a Room

           

         

