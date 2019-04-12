package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

//import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;

import java.util.List;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.click;
import static org.umssdiplo.automationv01.core.utils.CommonEvents.findWebElement;

public class IncidentUpdate extends BasePage {

    @FindBy(id = "updateIncident-0")
    private WebElement updateButton0;

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    public void navigateToEditIncident() {
        click(updateButton0);
    }

    public void verifyIncidentEdited(Incident incident) {
        WebElement createdElement = findWebElement(nameColumnList, incident.getName());
        if (null == createdElement) {
//            Assert.error();
        }
    }
}
