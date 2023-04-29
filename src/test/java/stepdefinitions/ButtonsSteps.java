package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ButtonsPage;
import pages.CategoriesPage;
import utils.DriverManager;

public class ButtonsSteps {

    ButtonsPage buttonsPage = new ButtonsPage(DriverManager.getDriver());

    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Then("should see {string} Buttons page")
    public void shouldSeeButtonsPage(String text) {

        buttonsPage.checkViewsButtonsPage(text);

    }

    @Given("user should on the Buttons page")
    public void userShouldOnTheButtonsPage() {

    categoriesPage.checkTabs("Views");
    categoriesPage.checkTabs("Buttons");
    }

    @Then("should Normal Button {string} on Buttons Page")
    public void shouldNormalButtonOnButtonsPage(String normal) {


        Assert.assertEquals(buttonsPage.clickNormalBtn(),normal);
    }

    @Then("should Small Button {string} on Buttons Page")
    public void shouldSmallButtonOnButtonsPage(String small) {

        Assert.assertEquals(buttonsPage.clickSmallBtn(),small);
    }


    @When("taps switch Button on Buttons Page")
    public void tapsSwitchButtonOnButtonsPage() {

        buttonsPage.clickSwitchBtn();

    }

    @Then("should Switch Button {string} on Buttons page")
    public void shouldSwitchButtonOnButtonsPage(String switchBtn) {

        Assert.assertEquals(buttonsPage.kapaliAcikBtn(),switchBtn);
    }
}
