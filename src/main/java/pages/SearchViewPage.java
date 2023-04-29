package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import utils.ElementHelper;

public class SearchViewPage {


    ElementHelper elementHelper;



    By title = By.id("android:id/action_bar_title");
    By searchBtn = By.id("io.appium.android.apis:id/action_search");
    By searchArea = By.id("android:id/search_src_text");

    By result = By.id("io.appium.android.apis:id/status_text");


    public SearchViewPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }




    public void clickSearchButton() {

elementHelper.click(searchBtn);

    }

    public void sendKeysSearchArea(String searchText) {

elementHelper.sendKeys(searchArea,searchText);


    }


    public void getResult() {

        elementHelper.checkElement(result);
    }


    public String getTitle() {
        return elementHelper.getText(title);
    }

}
