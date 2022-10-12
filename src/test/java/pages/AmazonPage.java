package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){//Constractor olusturup public yapmamız gerekir
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement emailBox;


    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continiueButton;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement problemMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElement forgetPasswordLink;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistanceText;


    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;


    @FindBy(xpath = "//h1")
    public WebElement createAccountText;







}