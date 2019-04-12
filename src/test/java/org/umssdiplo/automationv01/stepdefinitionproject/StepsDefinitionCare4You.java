package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentCreate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentUpdate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentHome;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

import java.util.List;

public class StepsDefinitionCare4You {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;
    private IncidentUpdate incidentEdit;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        home = manager.getHome();
        incidentHome = manager.getIncidentHome();
        incidentCreate = manager.getIncidentCreate();
        incidentEdit = manager.getIncidentUpdate();

    }

    @And("^click 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @And("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incidentHome.openIncidentsList();
    }

    @And("^click 'Create an incident' menu item in 'Incidents menu'$")
    public void openIncidentsForm() throws Throwable {
        incidentHome.openIncidentsForm();
    }

    @And("^click 'Generate Report' menu item in 'Incidents menu'$")
    public void openIncidentsReport() throws Throwable {
        incidentHome.openIncidentsReport();
    }

    @And("^click 'Delete Incident' menu item in 'Incidents menu'$")
    public void deleteIncidentsReport() throws Throwable {
        incidentHome.deleteIncidentsOption();
    }

    @And("^click 'Confirm Delete Incident' menu item in 'Incidents menu'$")
    public void OKDeleteIncidentsReport() throws Throwable {
        incidentHome.okDeleteIncidentsOption();
    }

    @Given("^Enter 'Create an incident' form information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }

    @Given("^Enter 'Update an incident' form information$")
    public void updateIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }

    @And("^verify incident item has been edited in 'Incidents list'$")
    public void verifyIncidentEdited(List<Incident> incident) throws Throwable {
        incidentEdit.verifyIncidentEdited(incident.get(0));
    }

    @And("^click 'Edit an incident' button in first element of 'Incidents list'$")
    public void navigateToEditIncident() throws Throwable {
        incidentEdit.navigateToEditIncident();
    }

    @And("^click 'submit' button in 'Incidents menu'$")
    public void submitIncidentsForm() throws Throwable {
        incidentCreate.submitIncidentsForm();
    }
}
