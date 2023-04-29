@ApiDemos
Feature: Api Demos

@buttonsPage
Scenario: check buttons page
Given user should see the categories page
When taps "Views" on categories page
When taps "Buttons" on categories page
Then should see "Views/Buttons" Buttons page

@buttonsPage  @CheckActions
Scenario: check buttons page actions
Given user should on the Buttons page
Then should Normal Button "NORMAL" on Buttons Page
Then should Small Button "SMALL" on Buttons Page
Then should Switch Button "KAPALI" on Buttons page
When taps switch Button on Buttons Page
Then should Switch Button "AÇIK" on Buttons page