@ApiDemos
Feature: Api Demos

  @SearchView
  Scenario: Check Search View Page
    Given user should see the categories page
    When taps "Views" on categories page
    When taps "Search View" on categories page
    When taps "Action Bar" on categories page
    Then should see Title "Views/Search View/Action Bar" on Search View Page

  @SearchView @CheckActions
  Scenario: Check Search View Page Actions
    Given user is on the Search View Page
    When taps to Search Button on Search View Page
    When sendkeys to Search Area "blabla" on Search View Page
    Then should see Result "blabla" on Search View Page