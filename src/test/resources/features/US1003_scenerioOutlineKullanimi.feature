#amazon sayfasına gidip sırasıyla nutella, java,elma aratip
#sonuclarin arama yaptıgımız kelimeyi icerdigini test edelim

  Feature: US1003 kullanici istedigi kelimleri aratir

    Scenario Outline: TC05 amazon listesindeki elementleri aratma


      Given Kullanici amazon sayfasina gider
      Then Kullanici "<istenenKelime>" icin arama yapar
      Then sonuclarin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|
      |nutella      |
      |java         |
      |elma         |
      |armut        |