package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07stepDefinition {

    PracticeTC07Page practiceTC07Page =new PracticeTC07Page();

    @Given("Tarayıciyi baslatarak {string} url'sine gidin")
    public void tarayıciyi_baslatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
    @When("Ana sayfanın başariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanın_başariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());

    }
    @When("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        practiceTC07Page.testCaseLink.click();
    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());

    }
    @Then("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
