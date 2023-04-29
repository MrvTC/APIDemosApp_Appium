package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.CategoriesPage;
import pages.SearchViewPage;
import utils.DriverManager;

public class SearchViewSteps {


    SearchViewPage searchViewPage = new SearchViewPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Given("user is on the Search View Page")
    public void userIsOnTheSearchViewPage() {

        categoriesPage.checkTabs("Views");
        categoriesPage.checkTabs("Search View");
        categoriesPage.checkTabs("Action Bar");



    }
    @Then("should see Title {string} on Search View Page")
    public void shouldSeeTitleOnSearchViewPage(String title) {


        String currentTitle = searchViewPage.getTitle();
        Assert.assertEquals(currentTitle, title);

    }


    @When("taps to Search Button on Search View Page")
    public void tapsToSearchButtonOnSearchViewPage() {

        searchViewPage.clickSearchButton();



    }

    @When("sendkeys to Search Area {string} on Search View Page")
    public void sendkeysToSearchAreaOnSearchViewPage(String searchText) {


        searchViewPage.sendKeysSearchArea(searchText);

    }

    @Then("should see Result {string} on Search View Page")
    public void shouldSeeResultOnSearchViewPage(String result) {

        searchViewPage.getResult();


    }
}
