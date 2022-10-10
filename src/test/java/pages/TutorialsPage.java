package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsPage {
    public TutorialsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesAndPdas;

    @FindBy(tagName = "h4")
    public List< WebElement> phoneMarkalari;


    @FindBy(xpath ="//*[@class='button-group']")
    public List< WebElement> addToCartButtons;

    @FindBy(xpath = "//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepetButonu;

    @FindBy(xpath = "//tbody//tr//td[@class='text-left']")
    public List<WebElement> sepettekiTelefonlar;








}
