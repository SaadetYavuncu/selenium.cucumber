Feature: US009 ClassWork

  Scenario Outline: TC01 ClassWork

    When kullanici "datatablesUrl" adresine gider
    Then new butonuna basar
    And Kullanici 1 sn bekler
    And isim bolumune "<firstname>" girer
    And Kullanici 1 sn bekler
    And soyisim bolumune "<lastname>" girer
    And Kullanici 1 sn bekler
    And position bolumune "<position>" girer
    And Kullanici 1 sn bekler
    And ofis bolumune "<ofisBlgisi>" girer
    And Kullanici 1 sn bekler
    And extension bolumune "<extension>" girer
    And Kullanici 1 sn bekler
    And start date bolumune "<startDate>" girer
    And Kullanici 1 sn bekler
    And salary bolumune "<salary>" girer
    And Kullanici 1 sn bekler
    And Create tusuna basar
    And Kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    And Kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And sayfayi kapatir
    Examples:
      | firstname | lastname | position  | ofisBlgisi  | extension  | startDate | salary   |
      | ALi        | Veli      | Qa       | Google   | Senior    | 2022-10-09  | 15000  |
      | Ahmet      | Mehmet    | Qa       | Google   | Junior    | 2022-12-15  | 10500  |
      | Hasan      | Duman     | Dev      | Amazon   | Junior    | 2020-10-30 | 25000  |
      | Akin       | Alkan     | Dev      | Amazon   | Senior    | 2022-10-03  | 50000  |
      | Orhan      | Duman     | PO       | WallMart | Senior    | 2000-01-01   | 30000  |



    #5 farklı kullanici bilgisi girer
