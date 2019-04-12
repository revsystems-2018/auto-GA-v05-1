package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class IncidentHome extends BasePage {
    @FindBy(id = "list-incidents-menu")
    private WebElement listIncidentsOption;

    @FindBy(id = "create-incident-menu")
    private WebElement createIncidentsOption;

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    @FindBy(id = "report-incident-menu")
    private WebElement reportIncidentsOption;

    @FindBy(id = "deleteIncident-1")
    private WebElement deleteIncidentsOption;

    @FindBy(id = "okDelete")
    private WebElement okDeleteIncidentsOption;

    private Integer initialSize;

    public void openIncidentsList() {
        CommonEvents.click(listIncidentsOption);
    }

    public void openIncidentsForm() {
        CommonEvents.click(createIncidentsOption);
    }

    public void openIncidentsReport() {
        CommonEvents.click(reportIncidentsOption);
    }
    public void deleteIncidentsOption() {
        CommonEvents.click(deleteIncidentsOption);
    }
    public void okDeleteIncidentsOption() {
        CommonEvents.click(okDeleteIncidentsOption);
    }

    public boolean verifyIncidentDeleted() {
        Integer newSize = nameColumnList.size();
        return (initialSize.equals(newSize) || initialSize < newSize);
    }
}
