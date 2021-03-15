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
  "duration": 7272428912,
  "status": "passed"
});
formatter.match({
  "location": "GooglePage.clink_on_language_links()"
});
formatter.result({
  "duration": 11658011182,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat StepDefinitions.GooglePage.clink_on_language_links(GooglePage.java:53)\r\n\tat ✽.Then clink on language links(GooglePage.feature:7)\r\n",
  "status": "failed"
});
});