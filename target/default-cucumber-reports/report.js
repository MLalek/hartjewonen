$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US0001_woningen_selectiefilters.feature");
formatter.feature({
  "name": "US0001 woningen selectiefilters",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Filter"
    }
  ]
});
formatter.background({
  "name": "Go to the page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the hartjewonen page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Filters.user_is_on_the_hartjewonen_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01 verifiëren the lijst met woningen die op de pagina getoond worden",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Filter"
    }
  ]
});
formatter.step({
  "name": "verify that all filter options selected as \"Alles\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Filters.verifyThatAllFilterOptionsSelectedAs(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: an option is not selected as Alles\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat stepdefinitions.Filters.verifyThatAllFilterOptionsSelectedAs(Filters.java:27)\r\n\tat ✽.verify that all filter options selected as \"Alles\"(file:///C:/Users/Mehmet/IdeaProjects/hartjewonen/src/test/resources/features/US0001_woningen_selectiefilters.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "there should be 7 houses listed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Filters.thereShouldBeHousesListed(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Go to the page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the hartjewonen page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Filters.user_is_on_the_hartjewonen_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02 verifiëren dat de getoonde woningen inderdaad 4 ruimtes hebben",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Filter"
    }
  ]
});
formatter.step({
  "name": "user wants to see Aantal ruimtes as \"4\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Filters.userWantsToSeeAantalRuimtesAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the houses which has \"4\" rooms are listed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Filters.verifyTheHousesWhichHasRoomsAreListed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Go to the page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the hartjewonen page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Filters.user_is_on_the_hartjewonen_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03 verifiëren dat de getoonde woningen zijn verkocht",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Filter"
    }
  ]
});
formatter.step({
  "name": "user wants to see sold houses \"VERKOCHT\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Filters.userWantsToSeeSoldHouses(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify sold houses are listed \"VERKOCHT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Filters.verify_sold_houses_are_listed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});