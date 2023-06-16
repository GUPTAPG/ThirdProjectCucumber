$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resourses/features/BackgroundChange.feature");
formatter.feature({
  "name": "Techfios billing login page functionality valiadation by changing background color",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "Sky Blue Background;",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepsForBackground.button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button1",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsForBackground.i_click_on_the_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsForBackground.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "White Background Change;",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyWhite Background\"button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepsForBackground.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button2",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsForBackground.i_click_on_the_button2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsForBackground.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});