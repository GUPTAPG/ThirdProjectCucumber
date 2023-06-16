@run
Feature: Techfios billing login page functionality valiadation by changing background color
@Scenario1
Scenario: Sky Blue Background;
Given "Set SkyBlue Background" button exists
When I click on the button1
Then the background color will change to sky blue
@Scenario2
Scenario: White Background Change; 
Given "Set SkyWhite Background"button exists
When I click on the button2
Then the background color will change to white
