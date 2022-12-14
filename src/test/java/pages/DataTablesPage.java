package pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;


    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstmaneButton;


    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement isimvar;


    @FindBy(xpath = "//h3")
    public WebElement addElementButon;


}
