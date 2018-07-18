Feature: Serenity demo

Agile Story:
As A user, when I search for an item,
I should be able to see search result displayed

  @demo @smoke @regression @smokeSomeField
  Scenario: Amazon search
    Given I am on amazon home page
    And I search for <iphone charger>
    Then Search result should be displayed

  Scenario: Amazon search 2
    Given I am on amazon home page
    And I search for <lamp>
    Then Search result should be displayed
