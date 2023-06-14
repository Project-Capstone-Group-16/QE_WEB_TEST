package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;
import starter.data.Admin;
import starter.helpers.DoAnAction;
import starter.helpers.InventronAdminPage;
import starter.helpers.InventronLandingPage;
import starter.helpers.NavigateTo;

import java.util.Locale;

public class InventronStepDefinitions {

    Faker faker = new Faker(new Locale("in-ID"));
    Admin admin = new Admin();
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
            case "Register" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_REGISTER_PAGE).hasText(text));
            case "Dashboard" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_DASHBOARD_PAGE).hasText(text));
            case "Kelola Barang" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_KELOLA_BARANG_PAGE).hasText(text));
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
    public void userIsOnInventronLoginPage(Actor actor){
        actor.wasAbleTo(NavigateTo.theInventronAdminPage());
    }

    @And("{actor} input the email on field {string}")
    public void adminInputEmailLogin (Actor actor, String emailLogin) {


        switch (emailLogin){
            case  "emailLogin" ->
                    actor.attemptsTo(DoAnAction.fillEmailLogin(dotenv.get(emailLogin)));

            case "Email" ->
                    actor.attemptsTo(DoAnAction.fillEmailLogin(admin.getEmail()));
        }
    }

    @And("{actor} input the password on field {string}")
    public void adminInputPasswordLogin (Actor actor, String passwordLogin) {

        switch (passwordLogin){
            case  "passwordLogin" ->
                    actor.attemptsTo(DoAnAction.fillPasswordLogin(dotenv.get(passwordLogin)));

            case "Password" ->
                    actor.attemptsTo(DoAnAction.fillPasswordLogin(admin.getPassword()));
        }
    }

    @And("{actor} click the button login")
    public void adminClickButtonLogin(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonLogin());
    }


    @And("{actor} click register menu")
    public void adminClickRegisterMenu(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonRegisterPage());
    }

    @And("{actor} input text field with {string}")
    public void adminInputTextFieldWith(Actor actor, String textField) {

        switch (textField) {
            case "Nama Depan" -> actor.attemptsTo(DoAnAction.fillNamaDepanRegister(faker.name().firstName()));

            case "Nama Belakang" -> actor.attemptsTo(DoAnAction.fillNamaBelakangRegister(faker.name().lastName()));

            case "Email Register" -> {
                String emailRegis = faker.internet().emailAddress();
                actor.attemptsTo(DoAnAction.fillEmailRegister(emailRegis));
                admin.setEmail(emailRegis);
            }
            case "Telepon" -> actor.attemptsTo(DoAnAction.fillPhoneRegister("8232256709"));

            case "Password Regis" -> {
                String passwordRegis = faker.internet().password();
                actor.attemptsTo(DoAnAction.fillPasswordRegister(passwordRegis));
                admin.setPassword(passwordRegis);
            }
            case "Confirm Password Regis" -> {
                actor.attemptsTo(DoAnAction.fillConfirmPasswordRegister(admin.getPassword()));
            }
        }
    }

    @Then("{actor} click daftar button")
    public void adminClickDaftarButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonRegister());
    }

    @Then("{actor} click the button logout")
    public void adminClickTheButtonLogout(Actor actor) {
        actor.wasAbleTo(DoAnAction.clickButtonLogout());
    }

    @Then("{actor} click the button kelola barang")
    public void adminClickTheButtonKelolaBarang(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonKelolaBarang());
    }
}
