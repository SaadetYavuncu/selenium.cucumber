Feature: US005 Blue RentaCar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given Kullanici "brcUrl" sayfasina gider
    Then Login yazisina tiklar
    And Kullanici 3 sn bekler
    And gecersiz username girer
    And gecersiz password girer
    And Kullanici 3 sn bekler
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And Kullanici 3 sn bekler
    And sayfayi kapatir