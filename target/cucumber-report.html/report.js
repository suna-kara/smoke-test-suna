$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/message.feature");
formatter.feature({
  "name": "send message",
  "description": "  User Story:\n  US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream\n\n\n  Account is mail:helpdesk1@cybertekschool.com\n  password:UserUser",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "User should login with correct credential",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "asdasdasd",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user is on the library login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});