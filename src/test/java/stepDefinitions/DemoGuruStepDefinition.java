package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class DemoGuruStepDefinition {
    DemoGuruPage demoGuruPage = new DemoGuruPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String anaSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(anaSayfa));
    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void istenenBasliktakiSutunlariYazdirma(String istenenBaslik) {
        switch (istenenBaslik) {
            case "Company":
                demoGuruPage.istenenCell(1);
                break;
            case "Group":
                demoGuruPage.istenenCell(2);
                break;
            case "Prev Close (Rs)":
                demoGuruPage.istenenCell(3);
                break;
            case "Current Price (Rs)":
                demoGuruPage.istenenCell(4);
                break;
            case "% Change":
                demoGuruPage.istenenCell(5);
                break;
            default:
                demoGuruPage.istenenCell(1);
        }
    }

    @And("{string} sutunundaki tum degerleri yazdir")
    public void sutunundakiTumDegerleriYazdir(String baslik) {
        int index = 0;
        for (int i = 0; i < demoGuruPage.basliklar.size(); i++) {
            if (demoGuruPage.basliklar.get(i).getText().equals(baslik)) {
                //Feature'dan gelen string değeri i degerine eşitledik
                System.out.println(demoGuruPage.basliklar.get(i).getText());
                //Feature'dan gelen başlığı yazdırdık
                index = i + 1;// Feature'dan gelen ve i değerine eşitlediğimiz
                // string'i aynı değere sahip sutunlarıda yazdırabilmek için

                // boş bir konternar oluşturup ona atadık. Listte index 0(sıfır) dan başladığı için ve webTable locate'imiz 1 den
                //başladığı için i değerini bir arttırdık.



                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + index + "]"));

                //Sonrasında webTable'daki body'i locate edip eşitlediğimiz index'i başlık
                // altındaki sutunu getirebilmesi için bu liste koyduk.


                sutunElement.forEach(t -> System.out.println(t.getText()));
                //Lambda ilede o sutunu yazdırdık

//            for (WebElement w:sutunElement) {
//                System.out.println(w.getText());
//           }

            }


        }
    }
}
