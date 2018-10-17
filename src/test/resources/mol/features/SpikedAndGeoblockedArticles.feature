Feature: Spiked and Geoblocked articles should not be accesible
  Background: Spiked article should not accesible
    And Geoblocked article should not accesible in that perticular geo.
    Scenario: I open dailymail
      When I try to open spiked article
      Then It should direct to parent channel