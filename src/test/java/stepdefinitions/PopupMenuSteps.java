package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.CategoriesPage;
import pages.PopupMenuPage;
import utils.DriverManager;

public class PopupMenuSteps {

    PopupMenuPage popupMenuPage = new PopupMenuPage(DriverManager.getDriver());

    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Given("user is on the Popup Menu page")
    public void userIsOnThePopupMenuPage() {

        categoriesPage.checkTabs("Views");
        categoriesPage.checkTabs("Popup Menu");

    }
    @Then("should see Title  {string} on Popup Menu Page")
    public void shouldSeeTitleOnPopupMenuPage() {

        String currentTitle= popupMenuPage.checkPopupMenu();

        Assert.assertEquals(currentTitle,"Views/Popup Menu");
    }



    @When("taps Make Popup Button on Popup Menu Page")
    public void tapsMakePopupButtonOnPopupMenuPage() {

        popupMenuPage.makeAPopup();
    }

    @Then("should see Popup Elemenet {string} on Popup Menu Page")
    public void shouldSeePopupElemenetOnPopupMenuPage(String popupElement) {

        popupMenuPage.clickButton(popupElement);
    }

    @When("taps Popup Element {string} on Popup Menu Page")
    public void tapsPopupElementOnPopupMenuPage(String popupElement) {

        popupMenuPage.clickShare(popupElement);
    }

    @Then("should see Popup Menu Title {string} on Popup Menu Page")
    public void shouldSeePopupMenuTitleOnPopupMenuPage(String title) {


        Assert.assertEquals(popupMenuPage.getPopupTitle(),title);
    }
}
