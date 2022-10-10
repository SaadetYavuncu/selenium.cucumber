package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCStepDefinition {
    HmcPage hmcPage = new HmcPage();
    @Given("Kullanici HMCUrl sayfasina gider")
    public void kullaniciHMCUrlSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }

    @Then("Log in yazisina tıklar")
    public void logInYazisinaTıklar() {
        hmcPage.loginButon.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.login.click();

    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
}

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));

    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));

    }
}
