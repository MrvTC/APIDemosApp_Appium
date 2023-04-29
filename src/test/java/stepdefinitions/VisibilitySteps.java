package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.CategoriesPage;

import pages.VisibilityPage;
import utils.DriverManager;


public class VisibilitySteps {

    VisibilityPage visibilityPage = new VisibilityPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Then("should see Visibility Page")
    public void shouldSeeVisibilityPage() {

        visibilityPage.checkVisibilityPage();

    }

    @Given("user is on the Visibility Page")
    public void userIsOnTheVisibilityPage() {

        categoriesPage.checkTabs("Views");
        categoriesPage.checkTabs("Visibility");

    }

    @Then("should see View Text {string} on Visibility Page")
    public void shouldSeeViewTextOnVisibilityPage(String text) {


        visibilityPage.checkViewBText(text);

    }

    @Then("should see Buttons {string} on Visibility Page")
    public void shouldSeeButtonsOnVisibilityPage(String buttontext) {

        visibilityPage.checkbuttons(buttontext);

    }

    @When("taps to Buttons {string} on Visibility Page")
    public void tapsToButtonsOnVisibilityPage(String button) {


        visibilityPage.clickButton(button);

    }

    @Then("should not see View Text {string} on Visibility Page")
    public void shouldNotSeeViewTextOnVisibilityPage(String viewB) {


Assert.assertFalse(visibilityPage.ViewBTextisVisibility().contains(viewB));
    }
}
