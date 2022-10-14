Feature: Parametre kullanimi

  @gp1
  Scenario:TC01 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "amazonUrl" sayfasina gider
    Then Kullanici 3 sn bekler
    Then url'in "amazon" icerdigini test eder
    And sayfayi kapatir

  @gp2
  Scenario:TC02 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "facebookUrl" sayfasina gider
    Then Kullanici 3 sn bekler
    Then url'in "facebook" icerdigini test eder
    And sayfayi kapatir

  @gp1
  Scenario:TC03 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "brcUrl" sayfasina gider
    Then Kullanici 3 sn bekler
    Then url'in "blue" icerdigini test eder
    And sayfayi kapatir

  @gp2
  Scenario:TC04 Parametre kullaniminda ConfigReader Kullanimi

    Given Kullanici "googleUrl" sayfasina gider
    Then Kullanici 3 sn bekler
    Then url'in "google" icerdigini test eder
    And sayfayi kapatir
