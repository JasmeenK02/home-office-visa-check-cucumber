Feature: Visa Confirmation Test
  As user I want to confirm visa requirements

  Background: I am on homepage
    When I click on accept cookies
    And I click on start button


@Smoke,@Regression
  Scenario: An Australian coming to UK for Tourism
    When I select nationality "Australia"
    And I click on continue button
    And I select reason "Tourism or visiting family and friends"
    And I click on continue button
    Then You will not need a visa to come to the UK message is displayed

@Sanity,@Regression
  Scenario: A Chilean coming to the UK for work and plans on staying for longer than six months
      When I select nationality "Chile"
      And I click on continue button
      And I select reason "Work, academic visit or business"
      And I click on continue button
      And I select intend to stay for 'longer than 6 months'
      And I click on continue button
      And I select have planning to work for "Health and care professional"
      Then You need a visa to work in health and care message is displayed
@Regression
  Scenario: A columbian national coming to the UK to join a partner for a long stay they do have an article 10 or 20 card
    When I select nationality 'Colombia'
    And I click on continue button
    And I select reason 'Join partner or family for a long stay'
    Then I click on continue button


