Feature: MostShared module on UK and US home

  Scenario: MostShared module should present on UK and US homepage
  and contains 5 articles
  and each articles should be opened if clicked.
    Given I am on UK homepage
    Then MostShared module is visible
    Then Title is displayed
    Then contains 5 articles
    And Images are visible for each article
    And Article titles are present for each article
    When I click on each  article
    Then The article should open
    And Verify the article url
