@All
Feature: Amazon Search

  @gp1
  Scenario: TC01 Kullanıcı amazonda nutella aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder



  @gp3
  Scenario: TC02 Kullanıcı amazonda Selenium aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder


  @gp2
  Scenario: TC03 Kullanıcı amazonda iphone aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

