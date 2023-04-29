package stepdefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import pages.CategoriesPage;
import utils.DriverManager;

public class CategoriesSteps {

    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Given("user should see the categories page")
    public void userShouldSeeTheCategoriesPage() {

        categoriesPage.checkCategories();
    }


    @When("taps {string} on categories page")
    public void tapsOnCategoriesPage(String taps) {

        categoriesPage.checkTabs(taps);

    }

}
