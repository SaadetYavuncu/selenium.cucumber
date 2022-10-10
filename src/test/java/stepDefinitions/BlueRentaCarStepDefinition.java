package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentaCarsPage;
import utilities.ConfigReader;

public class BlueRentaCarStepDefinition {

    BlueRentaCarsPage brcPage = new BlueRentaCarsPage();

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());

    }
}
