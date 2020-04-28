$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User search for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 10895204899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 17
    }
  ],
  "location": "MyStepDefinitions.user_search_for_something_vegetable(String)"
});
formatter.result({
  "duration": 5770399,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinations.MyStepDefinitions.user_search_for_something_vegetable(MyStepDefinitions.java:33)\r\n\tat ✽.When User search for \"Cucumber\" vegetable(search.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "MyStepDefinitions.something_results_are_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
});