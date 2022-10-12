package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();

    int trendyolUrunSayisi;
    int morhipoUrunSayisi;
    String trendyolWindowHandle;
    @Given("Kullanici google sayfasina gider")
    public void kullaniciGoogleSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("Kullanici trendyol u aratir")
    public void kullaniciTrendyolUAratir() {
        googlePage.aramaKutusu.sendKeys("Trendyol" , Keys.ENTER);


    }

    @And("trendyol linkini bulup siteye gider")
    public void trendyolLinkiniBulupSiteyeGider() {
        googlePage.trendyolAdress.click();
        googlePage.trendyolCerezKabul.click();
        trendyolWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("trendyol WindowHandle : " + trendyolWindowHandle);



    }

    @And("Kullanici makas aratir")
    public void kullaniciMakasAratir() {
        googlePage.trendyolAramaButonu.sendKeys("makas" , Keys.ENTER);


    }

    @And("toplam urun sayisini alir")
    public void toplamUrunSayisiniAlir() {
        String trendyolSonucYazisi = googlePage.trendyolSonucYazisiWE.getText();
        String[] trendyolSonucYazisiArr = trendyolSonucYazisi.split(" ");
        trendyolUrunSayisi = Integer.parseInt(trendyolSonucYazisiArr[3]);
        System.out.println("trendyol urun sayisi : " + trendyolUrunSayisi);
    }

    @Then("Kullanici yeni sekmede morhipoya gider")
    public void kullaniciYeniSekmedeMorhipoyaGider() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("morhipoUrl"));
    }

    @And("Kullanici morhipoda makas aratir")
    public void kullaniciMorhipodaMakasAratir() {

        googlePage.morhipoAramaButonu.sendKeys("makas" + Keys.ENTER);
    }

    @And("Morhipodaki toplam urun sayisini alir")
    public void morhipodakiToplamUrunSayisiniAlir() {
        String morhipoSonucSayisi = googlePage.morhipoSonucYazisiWE.getText();
        morhipoUrunSayisi = Integer.parseInt(morhipoSonucSayisi);
        System.out.println("morhipo urun sayisi : " + morhipoUrunSayisi);
    }

    @Then("iki sitedeki toplam makas sayisini karsilastirir")
    public void ikiSitedekiToplamMakasSayisiniKarsilastirir() {
        if (trendyolUrunSayisi > morhipoUrunSayisi) {
            System.out.println("Trendyol urun sayisi morhipo urun sayisindan daha fazladir.");
        } else {
            System.out.println("Morhipo urun sayisi trendyol urun sayisindan daha fazladir.");
        }
    }
    @And("Once urun sayisi fazla olan siteyi kapatir")
    public void onceUrunSayisiFazlaOlanSiteyiKapatir() {
        if (trendyolUrunSayisi > morhipoUrunSayisi) {
            Driver.getDriver().switchTo().window(trendyolWindowHandle);
            Driver.closeDriver();
        }else{
            Driver.closeDriver();
        }
    }
        @And("Sonra diger sayfayida kapatir")
        public void sonraDigerSayfayidaKapatir () {
        Driver.closeDriver();
        }
    }
