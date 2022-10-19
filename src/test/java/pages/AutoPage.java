package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {
    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='login']")
    public WebElement signin;

    @FindBy(xpath = "//*[@id='email_create']")
    public WebElement emailCreate;

    @FindBy (xpath = "//*[@id='id_gender1']")
    public WebElement radioButton;

    @FindBy(xpath = "(//*[text()='My account'])[1]")
    public WebElement myAccountText;






}
