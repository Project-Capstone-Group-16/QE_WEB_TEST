package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theInventronLandingPage() {
        return Task.where("{0} opens the Inventron landing page",
                Open.browserOn().the(InventronLandingPage.class));
    }


    public static Performable theInventronAdminPage(){
        return Task.where("{0} opens the Inventron admin page",
                Open.browserOn().the(InventronAdminPage.class));
    }

}