Feature: Spiked and Geoblocked articles should not be accesible
  Background: Spiked article should not accesible and if try to open it should redirect to channel page.
    And Geoblocked article should not accesible in that perticular geo and should redirect to search.
    Scenario: I open dailymail
      When I try to open spiked article
      Then It should direct to parent channel
      
      Scenario: I open dailymail.co.uk on UK Geo
      When I try to open UK geoblocked article in the UK geo
      Then It should not accesible and show the search option.
      
      
      