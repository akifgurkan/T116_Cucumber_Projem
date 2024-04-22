@nutakif
Feature: US1001 Nutella arama testi

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 Kullanici amazonda Samsung aratabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 Kullanici amazonda Java aratabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Java yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir




    # işareti ile yorum satırı kullanılır
    # Runner de çalışınca istediğimiz taglardaki tüm clas ve testleri çalıştırır
    # Test failed olduğunda cucumber-reports.html dan ekran görüntüsüne de bakabiliriz.
    # ve rapor alırız (cucumber-reports.html den). Bu File den çalıştırırsak rapor alamayız
    # ayrıca her çalıştırmadan önce çekiç e(Built Project)  basmamız gerekir