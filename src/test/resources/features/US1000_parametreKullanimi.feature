Feature: US1000 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario:Tc01 Kullanıcı parametre ile amazonda arama yapabilmeli

  Given Kullanici amazon sayfasina gider
  And Kullanici "java" icin arama yapar
  And sonuclarin "java" icerdigini test eder
  Then sayfayi kapatir