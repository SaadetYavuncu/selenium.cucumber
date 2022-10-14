Feature: US011 ClassWork
@DemoGur
  Scenario Outline:TC01 Kullanici sutun basligi ile liste alabilmeli

    Given kullanici "DemoGuruUrl" anasayfaya gider
    And "<Basliklar>" sutunundaki tum degerleri yazdir
  Examples:
    | Basliklar |
    | Company |
    | Group |
    | Prev Close (Rs) |
    | Current Price (Rs) |
    | % Change |

  Scenario: Kullanici sayfayi kapatir
    Given sayfayi kapatir