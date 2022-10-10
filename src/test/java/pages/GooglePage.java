package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//span[@class='x2VHCd OSrXXb qzEoUe']")
    public WebElement trendyolAdress;


    @FindBy(xpath = "//input[@class='vQI670rJ']")
    public WebElement trendyolAramaButonu;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement trendyolSonucYazisiWE;


    @FindBy(xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoAramaButonu;

    @FindBy(xpath = "//*[@id='total-product-count']")
    public WebElement morhipoSonucYazisiWE;

    @FindBy (xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement trendyolCerezKabul;


}
