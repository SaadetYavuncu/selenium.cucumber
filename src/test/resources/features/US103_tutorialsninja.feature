
  Feature: US103 Kullanıcı tutorialsninja sayfasında arama yapar

    Scenario: TC01 tutorialsninja sayfasıinda sepete urun ekleme

      Given Kullanici "tutorialsUrl" anasayfasinda
      Then Phones & PDAS'a tiklar
      Then Telefonlarin markalarini alir
      And Tum ogeleri sepete ekler
      And Sepete tiklar
      Then Sepetteki isileri alir
      And Sepetteki ve saydaki urunlerin dogru oldugunu karsilastirir
      And kullanici 2 sn bekler
      And sayfayi kapatir

