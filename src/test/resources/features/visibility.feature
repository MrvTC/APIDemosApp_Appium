@ApiDemos
Feature: Api Demos

  @Visibility
  Scenario: Check Visibility Page
    Given user should see the categories page
    When taps "Views" on categories page
    When taps "Visibility" on categories page
    Then should see Visibility Page

  @Visibility @CheckActions
  Scenario: Check Visibility Page Actions
    Given user is on the Visibility Page
    Then should see View Text "Views/Visibility" on Visibility Page
    Then should see Buttons "GONE" on Visibility Page
    When taps to Buttons "GONE" on Visibility Page
    Then should not see View Text "View B" on Visibility Page
    When taps to Buttons "VİS" on Visibility Page
    Then should see View Text "View B" on Visibility Page