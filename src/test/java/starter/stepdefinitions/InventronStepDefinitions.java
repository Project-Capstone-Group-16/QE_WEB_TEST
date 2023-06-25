package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import starter.data.Admin;
import starter.helpers.DoAnAction;
import starter.helpers.InventronAdminPage;
import starter.helpers.InventronLandingPage;
import starter.helpers.NavigateTo;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class InventronStepDefinitions {

    Faker faker = new Faker(new Locale("in-ID"));
    Admin admin = new Admin();
    Upload upload = new Upload();
    Dotenv dotenv = Dotenv.load();

    @Managed (driver = "chrome")
    WebDriver driver;





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
            case "Kelola Warehouse" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_KELOLA_WAREHOUSE_PAGE).hasText(text));
            case "Kelola Transaksi" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_KELOLA_TRANSAKSI).hasText(text));
            case "Not Fill Confirm Password" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_NOT_FILL_CONFIRM_PASSWORD).hasText(text));
            case "Tambah Data Warehouse" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_TAMBAH_DATA_WAREHOUSE).hasText(text));
            case "Pengguna" -> actor.attemptsTo(Ensure.that(InventronAdminPage.ASSERT_KELOLA_AKUN_PENGGUNA).hasText(text));
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
            case "Nama Warehouse" -> {
                String namaWarehouse = faker.address().city();
                actor.attemptsTo(DoAnAction.fillnamaDataWarehouse("Inventron " + namaWarehouse));
                admin.setCity(namaWarehouse);
            }
            case "Kota Warehouse" -> {
                actor.attemptsTo(DoAnAction.fillKotaDataWarehouse(admin.getCity()));
            }
            case "Alamat Warehouse" -> {
                String alamatWarehouse = faker.address().fullAddress();
                actor.attemptsTo(DoAnAction.fillAlamatDataWarehouse(alamatWarehouse));
            }
            case "Deskripsi Warehouse" -> {
                String deskripsiWarehouse = faker.lorem().sentence(25);
                actor.attemptsTo(DoAnAction.fillDeskripsiDataWarehouse(deskripsiWarehouse));
            }
            case "Nama Lengkap" -> {
                String namaLengkap = faker.name().fullName();
                actor.attemptsTo(DoAnAction.fillNamaLengkapUser(namaLengkap));
            }
//            case "Tanggal Lahir" -> {
//                actor.attemptsTo(DoAnAction.fillTanggalLahirDataUser("2002-04-25"));
//                driver.findElement(By.xpath("//input[@id='formStaff_phone_number']"));
//                driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).sendKeys(Keys.ENTER);
//                actor.attemptsTo(Hit.the(Keys.ENTER).into("//input[@id='formStaff_birth_date']"));
//
//            }
            case "No Hp Pegawai" -> actor.attemptsTo(DoAnAction.fillNoHpUser("8232256709"));
            case "Alamat Pegawai" -> {
                String alamatPegawai = faker.address().fullAddress();
                actor.attemptsTo(DoAnAction.fillAlamatDataUser(alamatPegawai));
            }
        }
    }


    @Then("{actor} is reload the site")
    public void adminReloadTheSite(Actor actor){
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();
    }

    @And("{actor} input the image")
    public void inputTheImage (Actor actor) throws URISyntaxException {
//        File file = new File("D:\\Kuliah\\MSIB\\GitHubDesktop\\CAPSTONE\\QE_WEB_TEST\\src\\test\\resources\\img\\Nuries.png");
//        String filePath = String.valueOf(file);
        Path fileToUpload = Paths.get(System.getProperty("user.dir") + "\\src\\test\\resources\\img\\Inventron.png");
        actor.attemptsTo(Upload.theFile(fileToUpload).to(InventronAdminPage.BUTTON_UPLOAD_IMAGE_WAREHOUSE));

    }

    @And("{actor} input the image for admin account")
    public void inputTheImageAdminAccount (Actor actor) throws URISyntaxException {
        Path fileToUpload = Paths.get(System.getProperty("user.dir") + "\\src\\test\\resources\\img\\Kitten.jpg");
        actor.attemptsTo(Upload.theFile(fileToUpload).to(InventronAdminPage.BUTTON_UPLOAD_IMAGE_AKUN_PEGAWAI));

    }

    @Then("{actor} dellete the content first")
    public void adminDelleteTheContent(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonDelleteTheContentWarehouse());
    }

    @Then("{actor} click the image of warehouse")
    public void adminClickTheImage(Actor actor) {
        actor.attemptsTo(DoAnAction.clickTheImageWarehouse());
    }

    @Then("{actor} see the image of warehouse")
    public void adminSeeTheImage(Actor actor) {
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

    @Then("{actor} click the button kelola warehouse")
    public void adminClickTheButtonKelolaWarehouse(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonKelolaWarehouse());
    }

    @Then("{actor} click the button tambah data warehouse")
    public void adminClickTheButtonTambahDataWarehouse(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonTambahWarehouse());
    }

    @Then("{actor} click the button ubah data warehouse")
    public void adminClickTheButtonUbahDataWarehouse(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonUbahWarehouse());
    }

    @Then("{actor} click the simpan perubahan button")
    public void  adminClickTheButtonSimpanPerubahan(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonSimpanPerubahanWarehouse());
    }

    @Then("{actor} click the button pegawai")
    public void  adminClickTheButtonAkunPegawai(Actor actor) {
        actor.attemptsTo(DoAnAction.clickButtonPegawaiAkun());
    }

    @Then("{actor} click {string} data button akun")
    public void  adminClickTheButtonInputDataAkun(Actor actor, String menu) {

        switch (menu){
            case "input" -> actor.attemptsTo(DoAnAction.clickButtonInputDataAkun());
            case "edit" -> actor.attemptsTo(DoAnAction.clickButtonEditAkun());
        }
    }

    @And("{actor} click the jabatan for admin account")
    public void  adminClickTheButtonJabatanDataAkun(Actor actor){

        actor.attemptsTo(DoAnAction.clickButtonJabatanDataAkun());
        actor.attemptsTo(DoAnAction.clickButtonJabatanManagerDataAkun());

    }


    @And("{actor} click the jenis kelamin for admin account")
    public void  adminClickTheButtonJkDataAkun(Actor actor){

        actor.attemptsTo(DoAnAction.clickButtonJenisKelaminDataAkun());
        actor.attemptsTo(DoAnAction.clickButtonJenisKelaminPerempuanDataAkun());
    }

    @And("{actor} click the input field tanggal lahir")
    public void  adminClickDropdownTanggalDataAkun(Actor actor) {
        actor.attemptsTo(DoAnAction.clickTheField());
        actor.attemptsTo(DoAnAction.clickTheYearOne());
        actor.attemptsTo(DoAnAction.clickTheHoverLeft());
        actor.attemptsTo(DoAnAction.clickTheHoverLeft());
        actor.attemptsTo(DoAnAction.clickTheYearTwo());
        actor.attemptsTo(DoAnAction.clickTheMonth());
        actor.attemptsTo(DoAnAction.clickTheDate());
    }

    @Then("{actor} click submit {string} button")
    public void  adminClickTheButtonSubmitDataAkun(Actor actor, String opsi) {

        switch (opsi){
            case "create" -> actor.attemptsTo(DoAnAction.clickButtonSubmitDataAkun());
            case "edit" -> actor.attemptsTo(DoAnAction.clickButtonSubmitEditAkun());
        }

    }

    @Then("{actor} will see the item on web for menu {string}")
    public void adminWillTheItemOnWeb(Actor actor, String menu) {

        switch (menu){
            case "Kelola Brang" -> driver.findElement(By.xpath("(//span[@id=\"tag__barang\"])[1]"));
            case "Kelola Transaksi" -> driver.findElement(By.xpath("(//td[text()='kategori loker'])[1]"));

        }
    }

    @Then("{actor} click the button {string}")
    public void adminClickTheButton(Actor actor, String menu) {

        switch (menu){
            case "Kelola Akun" -> actor.attemptsTo(DoAnAction.clickButtonKelolaAkun());
            case "Kelola Barang" -> actor.attemptsTo(DoAnAction.clickButtonKelolaBarang());
            case "Kelola Warehouse" -> actor.attemptsTo(DoAnAction.clickButtonKelolaWarehouse());
            case "Kelola Transaksi" -> actor.attemptsTo(DoAnAction.clickButtonKelolaTransaksi());
        }

    }

    @And("{actor} delete value on text field")
    public void adminDeleteValueOnTextField(Actor actor) throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.id("formStaff_address")).clear();

    }
}
