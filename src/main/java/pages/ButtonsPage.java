package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class ButtonsPage {

    ElementHelper elementHelper;

    By viewsButtonsPage = By.className("android.widget.TextView");
    By normalBtn = By.id("io.appium.android.apis:id/button_normal");
    By smallBtn = By.id("io.appium.android.apis:id/button_small");
    By kapalıBtn = By.id("io.appium.android.apis:id/button_toggle");


    public ButtonsPage(WebDriver driver) {


        this.elementHelper = new ElementHelper(driver);
    }

    public void checkViewsButtonsPage(String title) {

        Assert.assertEquals(elementHelper.getText(viewsButtonsPage),title);

    }

    public void checkButtonsPage(String title) {

        Assert.assertEquals(elementHelper.getText(viewsButtonsPage),title);


    }
    public String clickNormalBtn() {

return elementHelper.getText(normalBtn);

    }
    public String clickSmallBtn() {

        return elementHelper.getText(smallBtn);

    }
    public void clickSwitchBtn() {

        elementHelper.click(kapalıBtn);

    }
    public String kapaliAcikBtn() {


        return elementHelper.getText(kapalıBtn);


    }



}
