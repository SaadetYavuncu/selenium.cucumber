Feature: US004 Parametre Kullanimi

  Scenario: TC01 Parametre Kullanımı

    Given Kullanici "https://www.hepsiburada.com" sayfasinda
    Then Kullanici 3 sn bekler
    When url'in "hepsi" icerdigini test eder
    And sayfayi kapatir