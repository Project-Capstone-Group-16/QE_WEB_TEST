package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;
import starter.helpers.DoAnAction;
import starter.helpers.InventronAdminPage;
import starter.helpers.InventronLandingPage;
import starter.helpers.NavigateTo;

public class InventronStepDefinitions {

Dotenv dotenv = Dotenv.load();

    //---------------------------CODE DIBAWAH UNTUK LANDING PAGE WEB USER ----------------------------------------------
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

    //INI DIBAWAH ASSERTION
    @Then("{actor} will see the content on web {string} assert {string}")
    public void userWillSeeTheContentOnWeb(Actor actor, String text, String expected) {

        switch (expected) {
            case "Eksplorasi" -> actor.attemptsTo(Ensure.that(InventronLandingPage.ASSERT_EKSPLORASI).hasText(text));
            case "Tentang Kami" -> actor.attemptsTo(Ensure.that(InventronLandingPage.ASSERT_TENTANG_KAMI).hasText(text));
            case "Button Mulai" -> actor.attemptsTo(Ensure.that(InventronLandingPage.ASSERT_BUTTON_MULAI).hasText(text));
            case "Button Unduh" -> actor.attemptsTo(Ensure.that(InventronLandingPage.ASSERT_BUTTON_UNDUH).hasText(text));
            case "Login" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_LOGIN_PAGE).hasText(text));
            default -> throw new IllegalStateException("Unknown expected");
        }

    }
    //INI DIATAS ASSERTION

    @And("{actor} click button tentang kami")
    public void userClickButtonKontak(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonTentangKamiWeb());
    }

    @And("{actor} click button unduh")
    public void userClickButtonUnduh(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonUnduh());
    }

//--------------------------- CODE DIBAWAH UNTUK ADMIN PAGE -------------------------

    @Given("{actor} is on inventron login page")
    public void userIsOnInventronLoginPage(@NotNull Actor actor){
        actor.wasAbleTo(NavigateTo.theInventronAdminPage());
    }

    @And("{actor} input the email on field {string}")
    public void adminInputEmailLogin (Actor actor, String emailLogin) {
        actor.attemptsTo(DoAnAction.fillEmailLogin(dotenv.get(emailLogin)));
    }

    @And("{actor} input the password on field {string}")
    public void adminInputPasswordLogin (Actor actor, String passwordLogin) {
        actor.attemptsTo(DoAnAction.fillPasswordLogin(dotenv.get(passwordLogin)));
    }

    @And("{actor} click the button login")
    public void adminClickButtonLogin(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonLogin());}
}
