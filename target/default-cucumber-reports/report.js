$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Us_9.feature");
formatter.feature({
  "name": "tc_9",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@9"
    }
  ]
});
formatter.scenario({
  "name": "user should be able to add and delete product in the shopping list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@9"
    }
  ]
});
formatter.step({
  "name": "User go to Amazon site",
  "keyword": "When "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_1.userGoToAmazonSite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User hover over Account\u0026List",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_8.user_hover_over_Account_List()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clickt Create a List",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_8.user_clickt_Create_a_List()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User search Gift",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_9.user_search_Gift()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clickt one Product",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clickt Add to lIst",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User got More",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_8.user_got_More()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "usr should see procuct on Shopping List",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clickt Delete",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should see deleted message",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});