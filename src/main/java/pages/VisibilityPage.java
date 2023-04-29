package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementHelper;

public class VisibilityPage {

    ElementHelper elementHelper;

    By action_bar = By.xpath("//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");


    By viewB = By.className("android.widget.TextView");
    By Buttons = By.className("android.widget.Button");



    public VisibilityPage(WebDriver driver) {


        this.elementHelper = new ElementHelper(driver);
    }

    public void checkVisibilityPage() {


        elementHelper.checkElement(action_bar);
    }



    public void checkbuttons(String buttontext) {

elementHelper.checkElementWithText(Buttons,buttontext);

    }

    public void clickButton(String button) {

        elementHelper.clickElementWithText(Buttons,button);


    }

    public String ViewBTextisVisibility() {

    return elementHelper.getText(viewB);

    }

    public void checkViewBText(String text) {

        elementHelper.checkElementWithText(viewB,text);

    }

}
