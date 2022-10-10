Feature: US1001 dogru kullanici adı ve sifre ile giriş yapabilmeli

  Scenario: TC01 Positive login test
    Given Kullanici HMCUrl sayfasina gider
    Then Log in yazisina tıklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir