package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IncidentCreate extends BasePage {
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "date")
    private WebElement dateField;

    @FindBy(id = "type")
    private WebElement typeField;

    @FindBy(id = "severity")
    private WebElement severityField;

    @FindBy(id = "employeeId")
    private WebElement employeeIdField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    private final static String calendarExpr = "//div[@aria-label='";
    private final static String closeExpr = "']";

    public void fillIncidentsForm(Incident incident) {
        CommonEvents.setValue(nameField, incident.getName());
        CommonEvents.setValue(descriptionField, incident.getDescription());
        CommonEvents.click(dateField);
        CommonEvents.click(CommonEvents.findByXPath(getDate(incident.getDate())));
        CommonEvents.setValueNoEditable(typeField, incident.getType());
        CommonEvents.setValueNoEditable(severityField, incident.getSeverity());
        CommonEvents.setValueNoEditable(employeeIdField, incident.getEmployeeId());
    }

    public void submitIncidentsForm() {
        CommonEvents.click(submitButton);
    }


    private static String getDate(String date) {
        return calendarExpr + date + closeExpr;
    }
}
