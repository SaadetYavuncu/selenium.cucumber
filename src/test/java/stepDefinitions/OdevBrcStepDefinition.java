package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentaCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class OdevBrcStepDefinition {

    BlueRentaCarsPage blueRentaCarsPage = new BlueRentaCarsPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tikla")
    public void loginYazisinaTikla() {
        blueRentaCarsPage.login.click();
    }

    @And("{string} email girer")
    public void usernameGirer(String arg0) {
        blueRentaCarsPage.email.sendKeys("brcWrongEmail");
    }

    @And("{string} password girer")
    public void passwordGirer(String arg0) {
        blueRentaCarsPage.password.sendKeys("brcWrongPassword");
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        blueRentaCarsPage.login2.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentaCarsPage.ikinciLogin.isDisplayed());
    }

}
