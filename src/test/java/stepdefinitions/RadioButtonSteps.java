package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.CategoriesPage;
import pages.RadioButtonPage;
import utils.DriverManager;

public class RadioButtonSteps {


    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Given("user is on the Radio Button Page")
    public void userIsOnTheRadioButtonPage() {

        categoriesPage.checkTabs("Views");
        categoriesPage.checkTabs("Radio Group");
    }
    @Then("should see Title {string} on Radio Button Page")
    public void shouldSeeTitleOnRadioButtonPage(String title) {

        String currentTitle=radioButtonPage.getTitle();
        Assert.assertEquals(currentTitle,title);
    }


    @Then("should see Radio Button {string} on Radio Button Page")
    public void shouldSeeRadioButtonOnRadioButtonPage(String radioButton) {

        radioButtonPage.checkRadioButton(radioButton);

    }

    @Then("should see Clear Button {string} on Radio Button Page")
    public void shouldSeeClearButtonOnRadioButtonPage(String button) {

        String currentTitle=radioButtonPage.getClearButton();
        Assert.assertEquals(currentTitle,button);

    }

    @When("taps to Radio Button {string} on Radio Button Page")
    public void tapsToRadioButtonOnRadioButtonPage(String radioButton) {

        radioButtonPage.clickRadioButton(radioButton);

    }

    @Then("should see Selected Text {string} on Radio Button Page")
    public void shouldSeeSelectedTextOnRadioButtonPage(String text) {

        String currentTitle=radioButtonPage.getSelectedText();
        Assert.assertTrue(currentTitle.contains(text));
    }
}
