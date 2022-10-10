@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanıcı amazonda nutella aratır


    Then Kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder

  Scenario: TC02 Kullanıcı amazonda Selenium aratır


    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanıcı amazonda iphone aratır


    Then Kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir