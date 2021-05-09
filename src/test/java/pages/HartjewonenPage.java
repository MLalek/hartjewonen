package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class HartjewonenPage {
    public HartjewonenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(text(), 'WONINGAANBOD')]")
    public WebElement woningaanbod;


    @FindAll(
            @FindBy(xpath = "//div[@class='filter-button']/span[2]")
    )
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

//    @FindBy(xpath = "//*[@class='primary-color-text more-details CollapseMoreInfo']")
//    public List<WebElement> moreDetailButtons;
//
//    @FindBy(xpath = "//span[(text()='Technische gegevens')]")
//    public WebElement technicalDataTab;
//
//    @FindBy(xpath = "(//div[contains(text(),'4')])")
//    public WebElement numberOfRooms;

//***Verkocht****

    @FindBy(xpath = "(//span[@class='price secondary-color-text'])[2]")
    public WebElement avalibility;

    @FindBy(xpath = "//li[@data-value='Verkocht']")
    public WebElement sold;

//    @FindBy(xpath = "(//*[@class='house-status-label color-sold'])")
//    public List<WebElement> soldHouses;

    @FindBy(xpath = "//section[@data-availibility='Verkocht' and @data-bedrooms='4']")
    public List<WebElement> sold4RoomsHouses;

}
