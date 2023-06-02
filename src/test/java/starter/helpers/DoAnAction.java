package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DoAnAction {

    public static Performable clickButtonEksplorasiWeb () {
        return Task.where("{0} click eksplorasi button",
                Click.on(InventronLandingPage.BUTTON_EKSPLORASI)
        );
    }

    public static Performable clickButtonTentangKamiWeb() {
        return Task.where("{0} click kontak button",
                Click.on(InventronLandingPage.BUTTON_TENTANG_KAMI)
        );
    }

    public static Performable clickButtonMulaiWeb () {
        return Task.where("{0} click mulai button",
                Click.on(InventronLandingPage.BUTTON_MULAI)
        );
    }






}
