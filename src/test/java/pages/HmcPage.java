package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {

    public HmcPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginButon;


    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;


    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;


    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement login;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;


    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;


    @FindBy(xpath = "//*[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationButton;

    @FindBy(xpath = "//*[@class='btn btn-circle btn-default']")
    public WebElement addRoomReservationButonu;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;


    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement RoomReservationText;


    @FindBy(xpath = "//*[text()='OK']")
    public WebElement OKButton;
}