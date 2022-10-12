Feature: US007 Scenario Outline Kullanimi

@sonTest
  Scenario Outline:TC01 ConfigReader ile Scenario Outline Kullanimi

    Given Kullanici "<istenenUrl>" sayfasina gider
    Then Kullanici 3 sn bekler
    Then url'in "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir
  Examples:
    | istenenUrl | istenenKelime |
       |amazonUrl| amazon |
       |facebookUrl| facebook |
       |trdylUrl| trendyol |
       |brcUrl| blue |
       |googleUrl| google |
       |morhipoUrl| morhipo |







