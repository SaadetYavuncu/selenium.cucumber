package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.='Alerts'])[2]")
    public WebElement alerts;

    @FindBy(xpath = "(//*[text()='Click me'])[2]")
    public WebElement clickme;



}
