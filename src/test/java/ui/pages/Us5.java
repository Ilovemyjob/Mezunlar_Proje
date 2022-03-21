package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us5 {


    public Us5(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "a-autoid-0-announce")
        public WebElement sortBy;

    @FindBy(id = "s-result-sort-select_1")
    public WebElement lowtoHigh;

    @FindBy(xpath = "//span[@class='a-price']")
    public List<WebElement> priceLowtoHigh;

    //div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_6']//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']



}
