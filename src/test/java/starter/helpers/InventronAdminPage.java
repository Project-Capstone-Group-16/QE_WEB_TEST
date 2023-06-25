package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://inventron-indonesia.netlify.app/login")
public class InventronAdminPage extends PageObject{
    public static Target BUTTON_REGISTER_PAGE = Target.the("button register page").located(By.xpath("//a[contains(text(),'Daftar')]"));
    public static Target BUTTON_LOGIN_PAGE = Target.the("button login page").located(By.xpath("//a[contains(text(),'Masuk')]"));
    public static Target BUTTON_REGISTER = Target.the("button register").located(By.xpath("//*[text()='Daftar']"));
    public static Target BUTTON_LOGIN = Target.the("button login").located(By.xpath("//*[text()='Login']"));
    public static Target BUTTON_LOGOUT = Target.the("button logout").located(By.xpath("//*[text()='Logout']"));
    public static Target BUTTON_KELOLA_BARANG = Target.the("button kelola barang").located(By.xpath("//*[text()='Kelola Barang']"));
    public static Target BUTTON_KELOLA_TRANSAKSI = Target.the("button kelola transaksi").located(By.xpath("//a[contains(text(),'Kelola Transaksi')]"));

    // DIBAWAH KERJAAN ABK
    public static Target BUTTON_KELOLA_WAREHOUSE = Target.the("button kelola warehouse ").located(By.xpath("//a[contains(text(),'Kelola Warehouse')]"));
    public static Target BUTTON_TAMBAH_WAREHOUSE = Target.the("button tambah data warehouse ").located(By.xpath("//button[@id='add-button']"));
    public static Target BUTTON_UBAH_WAREHOUSE = Target.the("button ubah data warehouse ").located(By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/div[1]/div[1]/div[5]/button[1]"));
    public static Target BUTTON_UPLOAD_IMAGE_WAREHOUSE = Target.the("button ubah data warehouse ").located(By.xpath("//input[@id='warehouseForm_image_url']"));
    public static Target BUTTON_SIMPAN_WAREHOUSE = Target.the("button simpan data warehouse ").located(By.xpath("//button[@id='save-button']"));
    public static Target BUTTON_DELETE_CONTENT_WAREHOUSE = Target.the("button delete content data warehouse ").located(By.xpath("//button[@id='reset-button']"));
    public static Target BUTTON_IMAGE_WAREHOUSE = Target.the("button image data warehouse ").located(By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]"));
    public static Target BUTTON_KELOLA_AKUN = Target.the("button kelola akun ").located(By.xpath("//a[contains(text(),'Kelola Akun')]"));
    public static Target BUTTON_EDIT_AKUN = Target.the("button edit akun ").located(By.xpath("(//*[text()='Ubah'])[1]"));

    public static Target BUTTON_AKUN_PEGAWAI = Target.the("button akun pegawai").located(By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]"));
    public static Target BUTTON_INPUT_DATA_AKUN_PEGAWAI = Target.the("button input akun pegawai").located(By.xpath("//span[contains(text(),'Input Data')]"));
    public static Target BUTTON_UPLOAD_IMAGE_AKUN_PEGAWAI = Target.the("button input akun pegawai").located(By.xpath("//input[@id='formStaff_image_url']"));
    public static Target BUTTON_INPUT_JABATAN_AKUN_PEGAWAI = Target.the("button input akun jabatan").located(By.xpath("(//input[@id=\"occupation\"])[3]"));
    public static Target BUTTON_INPUT_JK_AKUN_PEGAWAI = Target.the("button input akun JK ").located(By.xpath("//input[@id='jenis_kelamin']"));
    public static Target BUTTON_SUBMIT_AKUN_PEGAWAI = Target.the("button submit akun ").located(By.xpath("//button[@id='btn-submit-pegawai']"));
    public static Target BUTTON_SUBMIT_EDIT_AKUN_PEGAWAI = Target.the("button submit edit akun ").located(By.xpath("//button[@id='btn-simpan-pegawai']"));
    public static Target BUTTON_MANAGER_AKUN_PEGAWAI = Target.the("button submit akun ").located(By.xpath("//div[text()='Manager']"));

    // DIATASKERJAAN ABK

    public static Target TEXT_FIELD_EMAIL_LOGIN = Target.the("text field email login").located(By.xpath("//input[@id='email']"));
    public static Target TEXT_FIELD_PASSWORD_LOGIN = Target.the("text field password login").located(By.xpath("//input[@id='password']"));
    public static Target TEXT_FIELD_NAMA_DEPAN = Target.the("text field nama depan").located(By.xpath("//input[@id='first_name']"));
    public static Target TEXT_FIELD_NAMA_BELAKANG = Target.the("text field nama belakang").located(By.xpath("//input[@id='last_name']"));
    public static Target TEXT_FIELD_EMAIL_REGISTER = Target.the("text field email register").located(By.xpath("//input[@id='email']"));
    public static Target TEXT_FIELD_PHONE_NUMBER = Target.the("text field nomor telepon").located(By.xpath("//input[@id='phone_number']"));
    public static Target TEXT_FIELD_PASSWORD_REGISTER = Target.the("text field password register").located(By.xpath("//input[@id='password']"));
    public static Target TEXT_FIELD_CONFIRM_PASSWORD_REGISTER = Target.the("text field confirm password register").located(By.xpath("//input[@id='confirm_password']"));

    public static Target TEXT_FIELD_NAMA_WAREHOUSE = Target.the("text field nama warehouse").located(By.xpath("//input[@id='warehouseForm_name']"));
    public static Target TEXT_FIELD_KOTA_WAREHOUSE = Target.the("text field kota warehouse").located(By.xpath("//input[@id='warehouseForm_city']"));
    public static Target TEXT_FIELD_ALAMAT_WAREHOUSE= Target.the("text field address warehouse").located(By.xpath("//input[@id='warehouseForm_address']"));
    public static Target TEXT_FIELD_DESKRIPSI_WAREHOUSE= Target.the("text field description warehouse").located(By.xpath("//textarea[@id='warehouseForm_description']"));

    public static Target TEXT_FIELD_NAMA_AKUN= Target.the("text field name account").located(By.xpath("//input[@id='formStaff_full_name']"));
    public static Target TEXT_FIELD_TGL_AKUN= Target.the("text field tgl account").located(By.xpath("//input[@id='formStaff_birth_date']"));
    public static Target TEXT_FIELD_NOHP_AKUN= Target.the("text field nohp account").located(By.xpath("//input[@id='formStaff_phone_number']"));
    public static Target TEXT_FIELD_ALAMAT_AKUN= Target.the("text field alamat account").located(By.xpath("//textarea[@id='formStaff_address']"));


    public static Target ASSERT_LOGIN_PAGE = Target.the("assert login page").located(By.xpath("//*[(text()='Belum punya akun? ')]"));
    public static Target ASSERT_REGISTER_PAGE = Target.the("assert register page").located(By.xpath("//*[(text()='Sudah memiliki akun?')]"));
    public static Target ASSERT_DASHBOARD_PAGE = Target.the("assert dashboard page").located(By.xpath("(//*[text()='Dashboard'])[2]"));
    public static Target ASSERT_KELOLA_BARANG_PAGE = Target.the("assert kelola barang page").located(By.xpath("(//*[text()='Kelola Barang'])[2]"));
    public static Target ASSERT_KELOLA_WAREHOUSE_PAGE = Target.the("assert kelola warehouse page").located(By.xpath("//h1[contains(text(),'Kelola Warehouse')]"));
    public static Target ASSERT_NOT_FILL_CONFIRM_PASSWORD = Target.the("assert not fill cofirm password").located(By.xpath("//div[contains(text(),'Silahkan masukkan konfirmasi password Anda!')]"));
    public static Target ASSERT_TAMBAH_DATA_WAREHOUSE = Target.the("assert tambah data warehouse").located(By.xpath("//h4[contains(text(),'Tambah Data Warehouse')]"));
    public static Target ASSERT_KELOLA_AKUN_PENGGUNA = Target.the("assert tambah data warehouse").located(By.xpath("//span[contains(text(),'Pengguna')]"));
    public static Target ASSERT_KELOLA_TRANSAKSI = Target.the("assert item kelola transaksi").located(By.xpath("//h1[contains(text(),'Kelola Transaksi')]"));


}
