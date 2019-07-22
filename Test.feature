Feature: Cash Withdrawal
  As an account holder, I want to be able to withdraw cash from my account,
  so that I can spend it

  Background: Account-holder has an valid account
    Given has valid card
    And a correct pin
#The background includes given and when but not then

  Scenario: Account-holder has no money in their account
#Scenarion is just a title
    Given I have no money
    #Given is a condition
    When I want to withdraw
    #When is action taken
    Then I should not be able to withdraw any money
    #Then is results

  Scenario: Account-holder has money in their account

    But I have money in my account
    When I want to withdraw
    Then i should be able to withdraw a valid amount

  Scenario Outline: Account-holder has or has no money in their account
    #Scenarion is just a title
    Given I have <money>
     #Given is a condition
    When I want to <withdraw>

    Then I should not <get_cash>
 #Then is results
    Examples:
    |money|withdraw|get_cash        |
    |0    |20      |no cash recieved|
    |20   |20      |cash recieved   |
    


