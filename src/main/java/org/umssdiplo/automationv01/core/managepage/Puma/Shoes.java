package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Shoes extends BasePage {

    @FindBy(xpath = "//div[@class='product-container___3GvlZ']/div/div/div//span[text()='$1,329']")
    private WebElement primerProductBtn;

    @FindBy(xpath = "//div[@class='product-container___3GvlZ']/div/div/div//div[text()='Calzado de Fútbol X 18.3 TF']")
    private WebElement primerProductClickBtn;

    @FindBy(xpath = "//form[@class='add_to_bag_form___227O2']/div/div/div/div/button/span[text()='Elige tu talla']")
    private WebElement SelectSizeClickBtn;

    @FindBy(xpath = "//div[@class='gl-dropdown__options gl-dropdown__options--squared gl-dropdown__options--with-after']/div/ul/li[9]/button[text()='MX 9.5']")
    private WebElement getSizeClickBtn;

    @FindBy(xpath = "//div[@class='row no-gutters add_to_bag_container___16ts0 null']/button[text()='Añadir al carrito']")
    private WebElement addBagClickBtn;

    @FindBy(xpath = "//div[@class='col-l-6']/div/p/span[text()=': 1']")
    private WebElement stockClickBtn;

    @FindBy(xpath = "//div[@class='col-l-12']/div/a[text()='ver carrito']")
    private WebElement seeBagClickBtn;

    @FindBy(xpath = "//div[@class='totalcolumn unitpricecolumn itemtotals left']/div/div[text()='$1,329.00']")
    private WebElement getPriceClickBtn;

    @FindBy(xpath = "//div[@class='co-product-actions']/button/span[text()='Eliminar']")
    private WebElement deleteClickBtn;


    public void setNavFutbol() {

        CommonEvents.clickButton(primerProductClickBtn);
        CommonEvents.clickButton(SelectSizeClickBtn);
        CommonEvents.clickButton(getSizeClickBtn);
        CommonEvents.clickButton(addBagClickBtn);
    }

    public void setModalItem() {
        CommonEvents.clickButton(stockClickBtn);
        CommonEvents.clickButton(seeBagClickBtn);
    }

    public void setDeleteClickItem() {
        CommonEvents.clickButton(deleteClickBtn);
    }

    public String getCantidadCarrito() {
        return stockClickBtn.getText();
    }
    public String getPriceCarrito() {
        return getPriceClickBtn.getText();
    }
}
