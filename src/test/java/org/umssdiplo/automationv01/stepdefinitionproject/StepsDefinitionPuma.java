package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Puma.Header;
import org.umssdiplo.automationv01.core.managepage.Puma.Shoes;
import org.umssdiplo.automationv01.core.utils.LoadPagePuma;

public class StepsDefinitionPuma {

    private Header header;
    private Shoes shoes;

    @Given("^'Adidas home' page is loaded$")
    public void adidasPageIsLoaded() throws Throwable {
        header = LoadPagePuma.homePagePuma();
    }

    @And("^Click in menu on 'Mens' page$")
    public void setClicksOnMansPage() throws Throwable {
        header.setNavHombres();
    }

    @And("^Click in first item on 'Futbol' page$")
    public void setClicksOnFutbolPage() throws Throwable {
        shoes.setNavFutbol();
    }

    @And("^Click on Modal item 'Carrito' page$")
    public void setClicksOnCarritoPage() throws Throwable {
        shoes.setModalItem();
    }

    @And("^Click on Delete item of 'Carrito' page$")
    public void setClicksOnDeletePage() throws Throwable {
        shoes.setDeleteClickItem();
    }

    @Then("^Verify \"([^\"]*)\" Price is displayed in cart$")
    public void verifyPriceCart(String price) throws Throwable {
        Assert.assertEquals(shoes.getPriceCarrito().toLowerCase(), price.toLowerCase());
    }

    @Then("^Verify quantity value is \"([^\"]*)\" from cart modal$")
    public void verifyQuantity(String expectedQuantity) throws Throwable {
        Assert.assertEquals(shoes.getCantidadCarrito(), expectedQuantity);
    }
}
