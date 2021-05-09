package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class HartjewonenPage {
    public HartjewonenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(text(), 'WONINGAANBOD')]")
    public WebElement woningaanbod;

    @FindAll(  @FindBy(xpath = "//div[@class='filter-button']/span[2]"))
    public List<WebElement> filterOptions;


    //****Lijst***

    @FindBy(xpath = "//*[@class='house-teaser-image']")
    public List<WebElement> houseList;



    //***4 Ruimtes***

    @FindBy(xpath = "(//span[@class='price secondary-color-text'])[1]")
    public WebElement allRoom;

    @FindBy(xpath = "//li[@data-value='4']" )
    public WebElement select4;

    @FindBy(xpath = "//section[@data-bedrooms='4']")
    public List<WebElement> listOf4roomsHouses;


    //***Verkocht****

    @FindBy(xpath = "(//span[@class='price secondary-color-text'])[2]")
    public WebElement avalibility;

    @FindBy(xpath = "//li[@data-value='Verkocht']")
    public WebElement sold;

    @FindBy(xpath = "//section[@data-availibility='Verkocht' and @data-bedrooms='4']")
    public List<WebElement> sold4RoomsHouses;

}
