$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/uiFeatures/Us_1.feature");
formatter.feature({
  "name": "Us_1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@1"
    },
    {
      "name": "@Parallel1"
    },
    {
      "name": "@Parallel2"
    }
  ]
});
formatter.scenario({
  "name": "User should reach to the Amazon web site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1"
    },
    {
      "name": "@Parallel1"
    },
    {
      "name": "@Parallel2"
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
  "status": "passed"
});
formatter.step({
  "name": "User can go to site",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_1.userCanGoToSite()"
});
formatter.result({
  "status": "passed"
});
});