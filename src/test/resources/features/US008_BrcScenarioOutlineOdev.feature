Feature: US008 scenario Outline Kullanimi
@BRC
Scenario Outline: : TC01kullanici gecersiz bilgilerle giris yapar

Given kullanici "brcUrl" anasayfasina gider
Then Login yazisina tikla
And "<gecersizEmail>" email girer
And "<gecersizPass>" password girer
And brc Login butonuna basar
Then brc sayfasina giris yapilamadigini kontrol eder
And Kullanici 3 sn bekler
And  sayfayi kapatir

Examples: :
| gecersizEmail   | gecersizPass |
|a@gmail.com      |    12346|
|b@gmail.com      |    13246|
|c@gmail.com      |    78974|
|d@gmail.com      |    78564|
|e@gmail.com      |    41454|