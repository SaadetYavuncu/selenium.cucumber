@Web
Feature: US014 Class Work

  Scenario: Kullanici ve Url Testi

    Given kullanici "WebUrl" anasayfaya gider
    When Kullanici 3 sn bekler
    Then kullanici Login Portala kadar asagi iner
    When Kullanici 3 sn bekler
    And kullanici Login Portala tiklar
    When Kullanici 3 sn bekler
    And kullanici diger windowa gecer
    When Kullanici 3 sn bekler
    And kullanici "username" kutusuna bilgileri girer
    When Kullanici 3 sn bekler
    And kullanici "password" bolumune bilgileri girer
    When Kullanici 3 sn bekler
    And kullanici login butonuna basar
    When Kullanici 3 sn bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    When Kullanici 3 sn bekler
    And kullanici Ok diyerek Popup'i kapatir
    When Kullanici 3 sn bekler
    And kullanici ilk sayfaya geri doner
    When Kullanici 3 sn bekler
    And kullanici ilk sayfaya donuldugunu test eder
    When Kullanici 3 sn bekler
    And sayfalari kapatir