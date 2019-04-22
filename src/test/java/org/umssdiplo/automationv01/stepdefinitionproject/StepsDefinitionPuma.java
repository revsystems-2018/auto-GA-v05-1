package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Puma.Header;
import org.umssdiplo.automationv01.core.utils.LoadPagePuma;

public class StepsDefinitionPuma {

    private Header header;

    @Given("^'Adidas home' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        header = LoadPagePuma.homePagePuma();
    }

    @And("^Click in menu on 'Mens' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        header.setNavHombres();
    }
}
