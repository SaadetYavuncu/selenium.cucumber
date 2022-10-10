Feature: US102 kullanici google da arama yapar

@google
  Scenario: TC01 Makas sayisi karsilastirma

    Given Kullanici google sayfasina gider
    Then Kullanici trendyol u aratir
    And trendyol linkini bulup siteye gider
    And Kullanici makas aratir
    And toplam urun sayisini alir
    Then Kullanici yeni sekmede morhipoya gider
    And Kullanici morhipoda makas aratir
    And Morhipodaki toplam urun sayisini alir
    Then iki sitedeki toplam makas sayisini karsilastirir
    Then kullanici 2 sn bekler
    And Once urun sayisi fazla olan siteyi kapatir
    Then kullanici 2 sn bekler
    And Sonra diger sayfayida kapatir

