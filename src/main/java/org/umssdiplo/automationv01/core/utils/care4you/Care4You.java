package org.umssdiplo.automationv01.core.utils.care4you;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentCreate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentUpdate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentHome;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.utils.WebUrls;

public final class Care4You {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;
    private IncidentUpdate incidentUpdate;

    private Care4You() {
        home = new Home();
        incidentHome = new IncidentHome();
        incidentCreate = new IncidentCreate();
        incidentUpdate = new IncidentUpdate();
    }

    public static Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.CARE4YOU));
        return new Care4You();
    }

    public Home getHome() {
        return home;
    }

    public IncidentHome getIncidentHome() {
        return incidentHome;
    }

    public IncidentCreate getIncidentCreate() {
        return incidentCreate;
    }

    public IncidentUpdate getIncidentUpdate() {
        return incidentUpdate;
    }
}
