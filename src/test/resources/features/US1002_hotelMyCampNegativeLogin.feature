#hotel my camp sitesinde 3 adet negative test senaryosu olusturalim
  #1-dogru username =yanlis password
  #2-yanlis username =dogru password
  #3-yanlis username =yanlis password

  Feature: US1002 yanlis bilgilerle siteye giris yapilamaz

    Scenario: TC02 yanlis password ile giris yapilamaz

      Given Kullanici HMCUrl sayfasina gider
      Then Log in yazisina tıklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir

    Scenario: TC03 yanlis sifre ile giris yapilamaz

      Given Kullanici HMCUrl sayfasina gider
      Then Log in yazisina tıklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir

    Scenario: TC04 yanlis sifre  ve yanlıs password ile giris yapilamaz

      Given Kullanici HMCUrl sayfasina gider
      Then Log in yazisina tıklar
      And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir