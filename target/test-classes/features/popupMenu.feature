@ApiDemos
Feature: Api Demos

@PopupMenuPage
Scenario: Check Popup Menu Page
Given user should see the categories page
When taps "Views" on categories page
When taps "Popup Menu" on categories page
Then should see Title  "Views/Popup Menu" on Popup Menu Page

@PopupMenuPage @CheckActions
Scenario: Check Popup Menu Page Actions
Given user is on the Popup Menu page
When taps Make Popup Button on Popup Menu Page
Then should see Popup Elemenet "Search" on Popup Menu Page
Then should see Popup Elemenet "Add" on Popup Menu Page
Then should see Popup Elemenet "Edit" on Popup Menu Page
When taps Popup Element "Share" on Popup Menu Page
Then should see Popup Menu Title "Share" on Popup Menu Page