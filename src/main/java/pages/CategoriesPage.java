package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By actionBar = By.id("android:id/action_bar");
    By categoriesList = By.id("android:id/text1");



    public CategoriesPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }

    public void checkCategories() {

   elementHelper.checkElement(actionBar);

    }
    public void checkTabs(String page) {

        elementHelper.clickElementWithText(categoriesList,page);



    }
}
