package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ui.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.actions.Upload;


import java.io.File;

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

    public static Performable clickButtonUnduh () {
        return Task.where("{0} click Unduh button",
                Click.on(InventronLandingPage.BUTTON_UNDUH)
        );
    }

    //------------------------------INI BUAT ADMIN LOGIN PAGE----------------------------

    public static Performable clickButtonLogin () {
        return Task.where("{0} click login buton",
                Click.on(InventronAdminPage.BUTTON_LOGIN)
        );
    }

    public static Performable clickButtonLogout () {
        return Task.where("{0} click logout buton",
                Click.on(InventronAdminPage.BUTTON_LOGOUT)
        );
    }

    public static Performable clickButtonKelolaBarang () {
        return Task.where("{0} click kelola barang buton",
                Click.on(InventronAdminPage.BUTTON_KELOLA_BARANG)
        );
    }

    // DIBAWAH KERJAAN ABK



    public static Performable clickButtonKelolaWarehouse () {
        return Task.where("{0} click kelola warehouse buton",
                Click.on(InventronAdminPage.BUTTON_KELOLA_WAREHOUSE)
        );
    }

    public static Performable clickButtonTambahWarehouse () {
        return Task.where("{0} click tambah data warehouse buton",
                Click.on(InventronAdminPage.BUTTON_TAMBAH_WAREHOUSE)
        );
    }

    public static Performable clickButtonUbahWarehouse () {
        return Task.where("{0} click ubah data warehouse buton",
                Click.on(InventronAdminPage.BUTTON_UBAH_WAREHOUSE)
        );
    }

    public static Performable fillnamaDataWarehouse (String namaWarehouse) {
        return Task.where("{0} fill nama data warehouse " + namaWarehouse,
                Enter.theValue(namaWarehouse).into(InventronAdminPage.TEXT_FIELD_NAMA_WAREHOUSE)
        );
    }

    public static Performable fillKotaDataWarehouse (String kotaWarehouse) {
        return Task.where("{0} fill kota data warehouse " + kotaWarehouse,
                Enter.theValue(kotaWarehouse).into(InventronAdminPage.TEXT_FIELD_KOTA_WAREHOUSE)
        );
    }

    public static Performable fillAlamatDataWarehouse (String alamatWarehouse) {
        return Task.where("{0} fill kota data warehouse " + alamatWarehouse,
                Enter.theValue(alamatWarehouse).into(InventronAdminPage.TEXT_FIELD_ALAMAT_WAREHOUSE)
        );
    }

    public static Performable fillDeskripsiDataWarehouse (String deskripsiWarehouse) {
        return Task.where("{0} fill kota data warehouse " + deskripsiWarehouse,
                Enter.theValue(deskripsiWarehouse).into(InventronAdminPage.TEXT_FIELD_DESKRIPSI_WAREHOUSE)
        );
    }

    public static Performable clickButtonSimpanPerubahanWarehouse () {
        return Task.where("{0} click perubahan data warehouse buton",
                Click.on(InventronAdminPage.BUTTON_SIMPAN_WAREHOUSE)
        );
    }

    public static Performable clickButtonDelleteTheContentWarehouse() {
        return Task.where("{0} click perubahan data warehouse buton",
                Click.on(InventronAdminPage.BUTTON_DELETE_CONTENT_WAREHOUSE)
        );
    }

    public static Performable clickTheImageWarehouse () {
        return Task.where("{0} click image warehouse buton",
                Click.on(InventronAdminPage.BUTTON_IMAGE_WAREHOUSE)
        );
    }

    public static Performable clickButtonKelolaAkun () {
        return Task.where("{0} click kelola akun buton",
                Click.on(InventronAdminPage.BUTTON_KELOLA_AKUN)
        );
    }

    public static Performable clickButtonPegawaiAkun () {
        return Task.where("{0} click pegawai akun buton",
                Click.on(InventronAdminPage.BUTTON_AKUN_PEGAWAI)
        );
    }

    public static Performable clickButtonInputDataAkun () {
        return Task.where("{0} click input data akun admin buton",
                Click.on(InventronAdminPage.BUTTON_INPUT_DATA_AKUN_PEGAWAI)
        );
    }

    public static Performable fillNamaLengkapUser (String namaLengkap) {
        return Task.where("{0} input data nama akun admin" + namaLengkap,
                Enter.theValue(namaLengkap).into(InventronAdminPage.TEXT_FIELD_NAMA_AKUN)
        );
    }

    public static Performable clickButtonJabatanDataAkun () {
        return Task.where("{0} click jabatan data akun admin buton",
                Click.on(InventronAdminPage.BUTTON_INPUT_JABATAN_AKUN_PEGAWAI)
        );
    }

    public static Performable clickButtonJabatanManagerDataAkun () {
        return Task.where("{0} click jabatan Manager data akun admin buton",
                Click.on(Dropdown.withNameOrId("formStaff_occupation").inside(String.valueOf(0)))
        );
    }

    public static Performable clickButtonJenisKelaminDataAkun () {
        return Task.where("{0} click jenis kelamin data akun admin buton",
                Click.on(InventronAdminPage.BUTTON_INPUT_JK_AKUN_PEGAWAI)
        );
    }
    public static Performable clickButtonJenisKelaminPerempuanDataAkun () {
        return Task.where("{0} click jenis kelamin data akun admin buton",
                Click.on(By.xpath("//input[@aria-activedescendant='formStaff_gender_list_1']"))
        );
    }

    public static Performable fillTanggalLahirDataUser (String tanggalLahir) {
        return Task.where("{0} input data nama akun admin" + tanggalLahir,
                Enter.theValue(tanggalLahir).into(InventronAdminPage.TEXT_FIELD_TGL_AKUN)
        );
    }

    public static Performable fillNoHpUser (String noHp) {
        return Task.where("{0} input data nama akun admin" + noHp,
                Enter.theValue(noHp).into(InventronAdminPage.TEXT_FIELD_NOHP_AKUN)
        );
    }

    public static Performable fillAlamatDataUser (String alamatPegawai) {
        return Task.where("{0} input data nama akun admin" + alamatPegawai,
                Enter.theValue(alamatPegawai).into(InventronAdminPage.TEXT_FIELD_ALAMAT_AKUN)
        );
    }

    public static Performable clickTheField () {
        return Task.where("{0} click tanggal lahir field",
                Click.on(By.xpath("//input[@id='formStaff_birth_date']"))
        );
    }
    public static Performable clickTheYearOne () {
        return Task.where("{0} click hover buton",
                Click.on(By.xpath("//button[contains(text(),'2023')]"))
        );
    }

    public static Performable clickTheHoverLeft () {
        return Task.where("{0} click hover buton",
                Click.on(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"))
        );
    }

    public static Performable clickTheYearTwo () {
        return Task.where("{0} click tahun lahir akun buton",
                Click.on(By.xpath("//div[contains(text(),'2002')]"))
        );
    }

    public static Performable clickTheMonth () {
        return Task.where("{0} click bulan lahir akun buton",
                Click.on(By.xpath("//div[contains(text(),'Apr')]"))
        );
    }

    public static Performable clickTheDate () {
        return Task.where("{0} click tanggal lahir akun buton",
                Click.on(By.xpath("//div[contains(text(),'25')]"))
        );
    }

    public static Performable clickButtonSubmitDataAkun () {
        return Task.where("{0} click submit data akun buton",
                Click.on(InventronAdminPage.BUTTON_SUBMIT_AKUN_PEGAWAI)
        );
    }

    public static Performable clickDropDownManager () {
        return Task.where("{0} click dropdown manager buton",
                Click.on(InventronAdminPage.BUTTON_MANAGER_AKUN_PEGAWAI)
        );
    }

    // DIATASKERJAAN ABK

    public static Performable clickButtonRegisterPage () {
        return Task.where("{0} click register page buton",
                Click.on(InventronAdminPage.BUTTON_REGISTER_PAGE)
        );
    }

    public static Performable clickButtonRegister () {
        return Task.where("{0} click register buton",
                Click.on(InventronAdminPage.BUTTON_REGISTER)
        );
    }

    public static Performable fillEmailLogin (String email) {
        return Task.where("{0} fill email login" + email,
                Enter.theValue(email).into(InventronAdminPage.TEXT_FIELD_EMAIL_LOGIN)
        );
    }

    public static Performable fillPasswordLogin (String password) {
        return Task.where("{0} fill password login" + password,
                Enter.theValue(password).into(InventronAdminPage.TEXT_FIELD_PASSWORD_LOGIN)
        );
    }

    public static Performable fillNamaDepanRegister (String namaDepan) {
        return Task.where("{0} fill nama depan register" + namaDepan,
                Enter.theValue(namaDepan).into(InventronAdminPage.TEXT_FIELD_NAMA_DEPAN)
        );
    }

    public static Performable fillNamaBelakangRegister (String namaBelakang) {
        return Task.where("{0} fill nama belakang register" + namaBelakang,
                Enter.theValue(namaBelakang).into(InventronAdminPage.TEXT_FIELD_NAMA_BELAKANG)
        );
    }

    public static Performable fillEmailRegister (String emailRegis) {
        return Task.where("{0} fill email register" + emailRegis,
                Enter.theValue(emailRegis).into(InventronAdminPage.TEXT_FIELD_EMAIL_REGISTER)
        );
    }

    public static Performable fillPhoneRegister (String phone) {
        return Task.where("{0} fill phone register" + phone,
                Enter.theValue(phone).into(InventronAdminPage.TEXT_FIELD_PHONE_NUMBER)
        );
    }

    public static Performable fillPasswordRegister (String passwordRegis) {
        return Task.where("{0} fill password register" + passwordRegis,
                Enter.theValue(passwordRegis).into(InventronAdminPage.TEXT_FIELD_PASSWORD_REGISTER)
        );
    }

    public static Performable fillConfirmPasswordRegister (String conformPasswordRegis) {
        return Task.where("{0} fill password register" + conformPasswordRegis,
                Enter.theValue(conformPasswordRegis).into(InventronAdminPage.TEXT_FIELD_CONFIRM_PASSWORD_REGISTER)
        );
    }

    public static Performable clickButtonKelolaTransaksi () {
        return Task.where("{0} click button kelola transaksi",
                Click.on(InventronAdminPage.BUTTON_KELOLA_TRANSAKSI)
        );
    }

}
