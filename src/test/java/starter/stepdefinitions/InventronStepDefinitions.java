package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

public class InventronStepDefinitions {

// TAR KALAU BUTUH DOTENV TINGGAL UNCOMMENT AJA   Dotenv dotenv = Dotenv.load();

    @Given("{actor} is on inventron landing page")
    public void userIsOnInventronLandingPage(@NotNull Actor actor){
        actor.wasAbleTo(NavigateTo.theInventronLandingPage());
    }

    @And("{actor} click button eksplorasi")
    public void clickButtonEksplorasi(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonEksplorasiWeb());}

    @And("{actor} click button mulai")
    public void clickButtonMulai(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonMulaiWeb());}








    @Then("{actor} will see the content on web")
    public void userWillSeeTheContentOnWeb(Actor actor) {
    }

}
