package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Header extends BasePage {

    @FindBy(css = ".site-nav__list__link primary-anchor has-subnav")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='inner___3Nvdx']/div/div/a[text() = 'HOMBRE']")
    private WebElement navRowMensValue;

    @FindBy(xpath = "//div[@class='col-5']/ul/li/a[text() = 'Fútbol']")
    private WebElement futbonBtn;

    public void setNavHombres() {

        Actions actions = new Actions(ManageDriver.getInstance().getWebDriver());
        actions.moveToElement(navRowMensValue);
//
//        actions.click();
        actions.perform();
        System.out.println(navRowMensValue);
        CommonEvents.clickButton(futbonBtn);
    }
}
