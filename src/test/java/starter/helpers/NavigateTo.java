package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.NamedUrl;

public class NavigateTo {

    public static Performable theInventronLandingPage() {
        return Task.where("{0} opens the Alta Shop Vercel home page",
                Open.browserOn().the(InventronLandingPage.class));
    }

}