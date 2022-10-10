Feature: US101 kullanici parametre ile configration file 'i kullanabilmeli

 @config
  Scenario: TC01 configuration properties dosyasından parametre kullanimi

   Given Kullanici "amazonUrl" anasayfasında
   Then kullanici 3 sn bekler
   And url'in "amazon" icerdigini test eder
   Then sayfayi kapatir