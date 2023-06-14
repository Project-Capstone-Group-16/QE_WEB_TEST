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
    public static Target TEXT_FIELD_EMAIL_LOGIN = Target.the("text field email login").located(By.xpath("//input[@id='email']"));
    public static Target TEXT_FIELD_PASSWORD_LOGIN = Target.the("text field password login").located(By.xpath("//input[@id='password']"));
    public static Target TEXT_FIELD_NAMA_DEPAN = Target.the("text field nama depan").located(By.xpath("//input[@id='first_name']"));
    public static Target TEXT_FIELD_NAMA_BELAKANG = Target.the("text field nama belakang").located(By.xpath("//input[@id='last_name']"));
    public static Target TEXT_FIELD_EMAIL_REGISTER = Target.the("text field email register").located(By.xpath("//input[@id='email']"));
    public static Target TEXT_FIELD_PHONE_NUMBER = Target.the("text field nomor telepon").located(By.xpath("//input[@id='phone_number']"));
    public static Target TEXT_FIELD_PASSWORD_REGISTER = Target.the("text field password register").located(By.xpath("//input[@id='password']"));
    public static Target TEXT_FIELD_CONFIRM_PASSWORD_REGISTER = Target.the("text field confirm password register").located(By.xpath("//input[@id='confirm_password']"));



    public static Target ASSERT_LOGIN_PAGE = Target.the("assert login page").located(By.xpath("//*[(text()='Belum punya akun? ')]"));
    public static Target ASSERT_REGISTER_PAGE = Target.the("assert register page").located(By.xpath("//*[(text()='Sudah memiliki akun?')]"));
    public static Target ASSERT_DASHBOARD_PAGE = Target.the("assert dashboard page").located(By.xpath("(//*[text()='Dashboard'])[2]"));
    public static Target ASSERT_KELOLA_BARANG_PAGE = Target.the("assert kelola barang page").located(By.xpath("(//*[text()='Kelola Barang'])[2]"));

}
