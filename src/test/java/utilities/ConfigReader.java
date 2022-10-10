package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {//Her method dan once çalıısır
        String dosyaYolu="src/configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            //fis dosyayolunu tanımladığımız configuration.properties dosyasını okudu

            properties = new Properties();
            properties.load(fis);//fis in okudugu bilgileri properties e yükledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public static String getProperty(String key){
        /*
        Test methodundan yolladığımız string key degerini alıp
        properties classından getProperty() methodunu kullanarak
        bu keye ait valueyu bize getirir.
         */

        return properties.getProperty(key);
    }
}
