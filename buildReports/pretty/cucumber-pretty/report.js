$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Kiwisaver Calculator",
  "description": "",
  "id": "kiwisaver-calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Information Icon for Kiwisaver Retirement Calculator",
  "description": "",
  "id": "kiwisaver-calculator;information-icon-for-kiwisaver-retirement-calculator",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyIcon"
    },
    {
      "line": 3,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The website URL for Kiwisaver Retirement Calculator",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    When User navigates to the Kiwisaver Calculators"
    }
  ],
  "line": 7,
  "name": "User clicks on Kiwisaver Start button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is displayed with Information icon \"\u003cMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "kiwisaver-calculator;information-icon-for-kiwisaver-retirement-calculator;",
  "rows": [
    {
      "cells": [
        "Message"
      ],
      "line": 11,
      "id": "kiwisaver-calculator;information-icon-for-kiwisaver-retirement-calculator;;1"
    },
    {
      "cells": [
        "This calculator has an age limit of 18 to 64 years old."
      ],
      "line": 12,
      "id": "kiwisaver-calculator;information-icon-for-kiwisaver-retirement-calculator;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12412952,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Information Icon for Kiwisaver Retirement Calculator",
  "description": "",
  "id": "kiwisaver-calculator;information-icon-for-kiwisaver-retirement-calculator;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyIcon"
    },
    {
      "line": 3,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The website URL for Kiwisaver Retirement Calculator",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    When User navigates to the Kiwisaver Calculators"
    }
  ],
  "line": 7,
  "name": "User clicks on Kiwisaver Start button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is displayed with Information icon \"This calculator has an age limit of 18 to 64 years old.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_website_url_for_kiwisaver_retirement_calculator()"
});
formatter.result({
  "duration": 5736063855,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_kiwisaver_start_button()"
});
formatter.result({
  "duration": 1752981398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This calculator has an age limit of 18 to 64 years old.",
      "offset": 41
    }
  ],
  "location": "StepDefinitions.user_is_displayed_with_information_icon_something(String)"
});
formatter.result({
  "duration": 13472711020,
  "error_message": "java.lang.NullPointerException\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:559)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat stepdefs.StepDefinitions.user_is_displayed_with_information_icon_something(StepDefinitions.java:90)\n\tat ✽.Then User is displayed with Information icon \"This calculator has an age limit of 18 to 64 years old.\"(Login.feature:8)\n",
  "status": "failed"
});
formatter.after({
  "duration": 124847008,
  "status": "passed"
});
});