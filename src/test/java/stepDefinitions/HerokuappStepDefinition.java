package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinition {
    HerokuappPage herokuappPage = new HerokuappPage();
    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herokuappPage.addElementButon.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deletButon));

        //ReusableMethods.waitForVisibility(herokuappPage.deletButon,10);
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        assert herokuappPage.deletButon.isDisplayed();

        //Bu sekilde de kullanilabiliyor
        //herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
        // yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz
        //Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
        // bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
        //Assert.assertTrue(herokuappPage.deletButon.isDisplayed()); **Aynısı**
        //herokuappPage.deletButon.isDisplayed(); sonuna nokta koyarsak yukarıdaki şekilde asertTrue olarak kullanabiliriz

    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuappPage.deletButon.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        //assert !herokuappPage.deletButon.isDisplayed();
        Assert.assertTrue(herokuappPage.deleteList.isEmpty());

    }

    @And("Add Element yazisinin gorunurlugunu test edin")
    public void addElementYazisininGorunurlugunuTestEdin() {
        herokuappPage.addElementButon.getText().equals("Add/Remove Elements");
    }
}
