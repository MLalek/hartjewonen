@Filter
  Feature: US0001 woningen selectiefilters
    Background: Go to the page
      Given user is on the hartjewonen page

    Scenario: TC01 verifiëren the lijst met woningen die op de pagina getoond worden
      Then verify that all filter options selected as "Alle"
      And there should be 7 houses listed

    Scenario: TC02 verifiëren dat de getoonde woningen inderdaad 4 ruimtes hebben
      When user wants to see Aantal ruimtes as "4"
      Then verify the houses which has "4" rooms are listed


    Scenario: TC03 verifiëren dat de getoonde woningen zijn verkocht
      When user wants to see sold houses "VERKOCHT"
      Then verify sold houses are listed "VERKOCHT"

