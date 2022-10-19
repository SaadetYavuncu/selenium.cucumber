@Demo
Feature: US016 Class Work4

  Scenario: TC01 alerts and explicitly wait

   Given Kullanici "demoUrl" sayfasina gider
   And Kullanici 2 sn bekler
    When kullanici Alerts buttonuna tiklar
   And Kullanici 2 sn bekler
    And kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And kullanici Allertin gorunur olmasini bekler
    And kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    And kullanici ok diyerek alerti kapatir