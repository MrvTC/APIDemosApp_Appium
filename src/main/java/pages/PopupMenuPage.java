package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PopupMenuPage {

    ElementHelper elementHelper;

    By actionBar = By.id("android:id/action_bar");
    By popupMenu = By.className("android.widget.Button");
    By popupElementBTn = By.className("android.widget.RelativeLayout");

    public PopupMenuPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String checkPopupMenu() {

      return elementHelper.getText(actionBar);

    }

    public void makeAPopup() {

        elementHelper.click(popupMenu);

    }


    public void clickButton(String popupElement ) {

     elementHelper.clickElementWithText(popupElementBTn,popupElement);



    }


    public void clickShare(String popupElement) {

        elementHelper.clickElementWithText(popupElementBTn,popupElement);
    }


    public String getPopupTitle() {

       return elementHelper.getText(actionBar);

    }




}
