package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDef {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @And("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();
        password= Faker.instance().internet().password();
        textarea= Faker.instance().animal().name();

        practiceFormPage.username.sendKeys(username);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.password.sendKeys(textarea);
        practiceFormPage.textarea.clear();
        practiceFormPage.textarea.sendKeys(textarea);




    }@And("bir dosya yukler")
    public void birDosyaYukler() {
        //practiceFormPage.chooseFile.sendKeys("\"C:\\Users\\PC\\Desktop\\test.txt\"");

        String homeDirectory = System.getProperty("user.home");
        String filepath = homeDirectory + "/Desktop/test.txt";

        practiceFormPage.chooseFile.sendKeys(filepath);
    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
        if(!practiceFormPage.checkBox1.isSelected()){//seçili değilse
            practiceFormPage.checkBox1.click();
        }
        if(practiceFormPage.checkBox2.isSelected()){//seçili ise
            practiceFormPage.checkBox2.click();
        }
        if(practiceFormPage.checkBox3.isSelected()){//seçili ise
            practiceFormPage.checkBox3.click();
             }
    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
        practiceFormPage.radio2.click();
    }

    @And("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
        practiceFormPage.selectItem3.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
        Select select = new Select(practiceFormPage.dropdown);
        Random random = new Random();
        int rastgele = random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        practiceFormPage.submitButton.click();
    }

    @And("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(practiceFormPage.filename.isDisplayed());
    }
}
