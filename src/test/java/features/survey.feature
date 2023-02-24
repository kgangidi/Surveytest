Feature: Login to qa-survey-respondent

  Scenario Outline: verify Access to cricket survey
    Given i navigate to url "https://qa-survey-respondent-web.marketonce.com/7@mysimpletest?mos_flag=test"
    Then i should be navigated to home page with title "MarketOnce.Survey.Respondent.Web"
    When i enter link in the browser and click enter
    Then I should be navigate to Continue page with title "MarketOnce.Survey.Respondent.Web"
    When I click on continue button
    Then I should be navigated to Cricket Survey with title "Survey"
    When I select Yes and click Continue page with title "Survey"
    And I enter What do you enjoy? enter as "<comment>"
    And I click Continue
    Then the response is submitted and message displays "We thank you for your time spent taking this survey. Your response has been recorded."

    Examples:
    |comment|
    |I love batting|

