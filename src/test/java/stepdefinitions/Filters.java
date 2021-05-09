package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HartjewonenPage;
import utilities.ReusableMethods;

import java.util.List;

public class Filters {
    HartjewonenPage hartjewonenPage = new HartjewonenPage();

    @Given("user is on the hartjewonen page")
    public void user_is_on_the_hartjewonen_page() {
        ReusableMethods.waitForClickablility(hartjewonenPage.woningaanbod, 5);
        hartjewonenPage.woningaanbod.click();
    }

    @Then("verify that all filter options selected as {string}")
    public void verifyThatAllFilterOptionsSelectedAs(String expectedOptionText) {
        List<String> actualFilterTexts = ReusableMethods.getElementsText(hartjewonenPage.filterOptions);
        Assert.assertTrue("an option is not selected as "+expectedOptionText,
                actualFilterTexts.stream().allMatch(e -> e.equals(expectedOptionText))
        );
    }

    @Then("there should be {int} houses listed")
    public void thereShouldBeHousesListed(int listedHouses) {
        Assert.assertEquals(listedHouses, hartjewonenPage.houseList.size(), listedHouses);

        System.out.println("7 houses listed on the page");
    }

    @Given("user wants to see Aantal ruimtes as {string}")
    public void userWantsToSeeAantalRuimtesAs(String arg0) throws InterruptedException {
        ReusableMethods.hover(hartjewonenPage.allRoom);
        ReusableMethods.waitForVisibility (hartjewonenPage.select4,5);
        hartjewonenPage.select4.click();

    }

    @Then("verify the houses which has {string} rooms are listed")
    public void verifyTheHousesWhichHasRoomsAreListed(String four) {
        for (WebElement eachHouse : hartjewonenPage.listOf4roomsHouses){
            System.out.println(eachHouse.getText());
            Assert.assertTrue(eachHouse.getText().contains("4 RUIMTES"));
        }

    }


    @When("user wants to see sold houses {string}")
    public void userWantsToSeeSoldHouses(String string) {
        ReusableMethods.hover(hartjewonenPage.avalibility);
        ReusableMethods.waitForVisibility(hartjewonenPage.sold,5);
        hartjewonenPage.sold.click();

    }

    @Then("verify sold houses are listed {string}")
    public void verify_sold_houses_are_listed(String verkocht) {
        for (WebElement each:hartjewonenPage.sold4RoomsHouses) {
            Assert.assertTrue(each.getText().contains(verkocht));
        }
        System.out.println(hartjewonenPage.sold4RoomsHouses.size()+" houses with 4 rooms were sold");
        }

}









