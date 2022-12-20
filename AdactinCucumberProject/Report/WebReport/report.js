$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/adactin.feature");
formatter.feature({
  "name": "Adactin hotel Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to the home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter in to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.enter_in_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username and password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "record the result",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.record_the_result()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Select Location name from dropDown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_Location_name_from_dropDown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Hotel name from dropDown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_Hotel_name_from_dropDown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Room type from dropDown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_Room_type_from_dropDown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select number of rooms from dropDown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_number_of_rooms_from_dropDown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Check in Date",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.enter_Check_in_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter check out date",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.enter_check_out_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select adults per room from drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_adults_per_room_from_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select children per room from drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.select_children_per_room_from_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Selecting Hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selecting hotel",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.selecting_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Continue the process",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.continue_the_process()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a Hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter Personal details",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.enter_Personal_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give card details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.give_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Book a Room",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.book_a_Room()"
});
formatter.result({
  "status": "passed"
});
});