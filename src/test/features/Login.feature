Feature: Kiwisaver Calculator

  @VerifyIcon @Web
  Scenario Outline: Information Icon for Kiwisaver Retirement Calculator
    Given The website URL for Kiwisaver Retirement Calculator
#    When User navigates to the Kiwisaver Calculators
    And User clicks on Kiwisaver Start button
    Then User is displayed with Information icon "<Message>"

    Examples:
      |Message|
      |This calculator has an age limit of 18 to 64 years old.|
