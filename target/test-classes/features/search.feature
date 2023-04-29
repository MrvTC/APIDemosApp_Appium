@ApiDemos
Feature: Api Demos

  @FindElement
  Scenario: Find Element
    Given uygulamanın açıldığı kontrol edilir

  @GetText
  Scenario: Get Text
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir

  @click
  Scenario: Click
    Given uygulamanın açıldığı kontrol edilir
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden App tabine tıklanır

  @sendKeys
  Scenario Outline: SendKeys
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden "<tab1>" tabine tıklanır
    When tablarden "<tab2>" tabine tıklanır
    When tablarden "<tab3>" tabine tıklanır
    When Search butonuna tıklanır
    When Search alanına "<text>" yazılır
    Then Text area "<text>" değerini içeriyormu kontrol edilir

    Examples:
      | tab1 | tab2       | tab3             | text  |
      | App  | Action Bar | Action Bar Usage | merve |

  @scroll
  Scenario: scroll UiSelector/UiScrollable
    Given uygulamanın açıldığı kontrol edilir
    When tablarden "Graphics" tabine tıklanır
    When tablardan touch paint tabine tıklanır









