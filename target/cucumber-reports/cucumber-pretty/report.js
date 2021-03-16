$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GooglePage.feature");
formatter.feature({
  "line": 1,
  "name": "to launch google page",
  "description": "",
  "id": "to-launch-google-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "to launch and validate google page",
  "description": "",
  "id": "to-launch-google-page;to-launch-and-validate-google-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "to launch google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "clink on language links",
  "keyword": "Then "
});
formatter.match({
  "location": "GooglePage.to_launch_google_page()"
});
formatter.result({
  "duration": 7441331277,
  "status": "passed"
});
formatter.match({
  "location": "GooglePage.clink_on_language_links()"
});
formatter.result({
  "duration": 13582147452,
  "status": "passed"
});
});