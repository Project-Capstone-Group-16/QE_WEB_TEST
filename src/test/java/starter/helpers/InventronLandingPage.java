package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://inventron-indonesia.netlify.app")
public class InventronLandingPage extends PageObject {

    public static Target BUTTON_EKSPLORASI = Target.the("button eksplorasi").located(By.xpath("//a[contains(text(),'Eksplorasi')]"));

    public static Target BUTTON_MULAI = Target.the("button mulai").located(By.xpath("//button[contains(text(),'Mulai')]"));
    public static Target ASSERT_EKSPLORASI = Target.the("assert ekplorasi").located(By.xpath("//*[text()='Aplikasi Penyimpanan Barang yang Aman dan Terpercaya']"));
    public static Target ASSERT_BUTTON_MULAI = Target.the("assert button mulai").located(By.xpath("//*[@id='mengapa']"));

}
