package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Driver {

    private Driver() {

    }
    /*
    POM'de Driver için TestBaseBeforeClassAfterClass ına extends etmek yerine
    Driver classından methodlar kullanarak driver olusturup ilgili ayarların
     yapılması ve sonda driverin kapatılması tercih edilmistir.
     */


    static WebDriver driver;
    /*
    Tetlerimizi çalıstırdığımızda herseferinde yeni driver olusturdugu için her test methodu için
    yeni bir pencere (driver) acıyor.
    Eger driver a bir deger atanmamışsa yani driver==null ise bir kere driver i çalıstır
    diyerek bir kere if içini çalıştıracak.Ve driver artık bir kere çalıştıgı için ve deger atandıgı için null olmayacak
    ve direk return edecek ve diger testlerimiz aynı pencere(driver) uzerinde çalısacak
     */
    protected static Actions actions;
    protected static String tarih;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "opera" :
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;

                    case "headless-chrome" ://chrome u gormeden arka planda çalısır bize sonucu gösterir sadece
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                        break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        actions = new Actions(driver);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formater);
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){//drivera deger atanmışsa kapat
            driver.close();
            driver=null;  //Kapandıktan sonra sonraki açmaları garanti altına almak için driveri tekrar null yaptık
        }


    }
    public static void quitDriver(){
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}

/*
//Public olarak tanımlanan öğeye kod bloğunun içinden ve dışından erişebilir, yani her yerden ulaşılabilir denilebilir.
//Statik tanımlaması yapıldığında ise bu sınıfa herhangi bir nesne oluşturmadan, sadece adıyla çağırıp erişim sağlanabilir.
 */