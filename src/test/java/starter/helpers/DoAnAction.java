package starter.helpers;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

    public static Performable clickButtonEksplorasiWeb () {
        return Task.where("{0} click eksplorasi button",
                Click.on(InventronLandingPage.BUTTON_EKSPLORASI)
        );
    }

    public static Performable clickButtonMulaiWeb () {
        return Task.where("{0} click mulai button",
                Click.on(InventronLandingPage.BUTTON_MULAI)
        );
    }






}
