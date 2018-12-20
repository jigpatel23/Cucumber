Feature: MostShared module on UK and US home

  Scenario: MostShared module should present on UK  homepage
    and contains 5 articles
    and each articles should be opened if clicked.

    Given I am on UK homepage
    Then MostShared module is visible
    Then Title is displayed
    Then contains 5 articles
    And Images are visible for each article
    And Article titles are present for each article
    When I click on first  article
    Then Verify the article url

  Scenario: MostShared module should present on  US homepage
    and contains 5 articles
    and each articles should be opened if clicked.

    Given I am on US homepage
    Then US MostShared module is visible
    Then The Title is displayed
    Then It contains 5 articles
    And The Images are visible for each article
    And Article titles are present for each article in US MSR
    When I click on first  article in MSR
    Then The article open and Verify the article url
