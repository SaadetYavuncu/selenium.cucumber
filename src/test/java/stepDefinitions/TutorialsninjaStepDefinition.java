package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class TutorialsninjaStepDefinition {

    TutorialsPage tutorialsPage = new TutorialsPage();
    List<String> phoneList = new ArrayList<>();
    List<String> sepettekiUrunlerList = new ArrayList<>();
    @Then("Phones & PDAS'a tiklar")
    public void phonesPDASATiklar() {
        tutorialsPage.phonesAndPdas.click();

    }

    @Then("Telefonlarin markalarini alir")
    public void telefonlarinMarkalariniAlir() {
        for (WebElement w:tutorialsPage.phoneMarkalari) {
            phoneList.add(w.getText());
        }
        System.out.println("telefon markalari : " +phoneList);
    }

    @And("Tum ogeleri sepete ekler")
    public void tumOgeleriSepeteEkler() {
        for (WebElement w :tutorialsPage.addToCartButtons) {
            w.click();

        }
    }

    @And("Sepete tiklar")
    public void sepeteTiklar() {
        tutorialsPage.sepetButonu.click();
    }

    @Then("Sepetteki isileri alir")
    public void sepettekiIsileriAlir() {
        for (WebElement w :tutorialsPage.sepettekiTelefonlar) {
            sepettekiUrunlerList.add(w.getText());

        }
        System.out.println("sepetteki urunlerin listesi : " + sepettekiUrunlerList);


    }

    @And("Sepetteki ve saydaki urunlerin dogru oldugunu karsilastirir")
    public void sepettekiVeSaydakiUrunlerinDogruOldugunuKarsilastirir() {

        Collections.sort(phoneList);
        Collections.sort(sepettekiUrunlerList);
        Assert.assertEquals(phoneList,sepettekiUrunlerList);


    }


}
