#Author: your.email@your.domain.com
Feature: Creating a new customer

  Scenario:  tariff plan
    And User click on add tariff button
    When User filling up tariff plan all the details
    And User click on add tariff submit button
    Then User verifying add tariff congrats msg

  Scenario:  tariff plan with 1dim list
    And User click on add tariff button
    When User filling up tariff plan all the details with one dim list
      | 34 | 25 | 4 | 59 | 5 | 1 | 6 |
    And User click on add tariff submit button
    Then User verifying add tariff congrats msg

  Scenario:  tariff plan with 1dim map
    And User click on add tariff button
    When User filling up tariff plan all the details with one dim map
      | Rent | 450 |
      | Lim  | 300 |
      | Imp  | 250 |
      | Sps  | 666 |
      | Mca  |   4 |
      | Ics  |   7 |
      | Scp  |   5 |
    And User click on add tariff submit button
    Then User verifying add tariff congrats msg

  Scenario: tariff plan with 2dim list
    And User click on add tariff button
    When User filling up tariff plan all the details with two dim list
      | 340 | 250 | 430 | 545 | 5 | 7 | 9 |
      | 700 | 450 | 620 | 800 | 3 | 2 | 4 |
      | 680 | 500 | 280 | 730 | 6 | 1 | 2 |
      | 890 | 900 | 780 | 246 | 1 | 3 | 5 |
      | 660 | 110 | 550 | 115 | 6 | 7 | 4 |
      | 300 | 840 | 770 | 880 | 3 | 2 | 1 |
      | 100 | 200 | 304 | 405 | 5 | 8 | 9 |
    And User click on add tariff submit button
    Then User verifying add tariff congrats msg

  Scenario: tariff plan with 2dim map
    And User click on add tariff button
    When User filling up tariff plan all the details with two dim list
      | RT | LMP | IMS | SPC | MCS | ICO | SCM |
      | 10 | 455 |  60 |  87 |   9 |   1 |   6 |
      | 65 |  50 |  28 |  74 |   6 |   2 |   7 |
      | 89 |  90 |  78 |  22 |   1 |   3 |   5 |
      | 66 |  41 |  57 |  16 |   6 |   4 |   9 |
      | 30 |  28 |  77 |  88 |   3 |   5 |   4 |
      | 66 |  27 |  76 |  59 |   2 |   7 |   8 |
    And User click on add tariff submit button
    Then User verifying add tariff congrats msg
