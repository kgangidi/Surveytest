Feature: qa-survey-respondent who dont like cricket

  Scenario verify Access to cricket survey
    Given Verify user navigate to url "https://qa-survey-respondent-web.marketonce.com/7@mysimpletest?mos_flag=test"
    Then Verify user should be navigated to home page with title "MarketOnce.Survey.Respondent.Web"
    When Verify user enter link in the browser and click enter
    Then Verify user should be navigate to Continue page with title "MarketOnce.Survey.Respondent.Web"
    When Verify user click on continue button
    Then Verify user should be navigated to Cricket Survey with title "Survey"
    When Verify user select No as an option
    And  Verify click Continue page with title "Survey"
    Then Verify user should be navigated to End of Survey with following msg "We thank you for your time spent taking this survey. Your response has been recorded."


