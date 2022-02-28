package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class Us5 {


    public Us5(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "a-autoid-0-announce")
        public WebElement sortBy;

    @FindBy(id = "s-result-sort-select_1")
    public WebElement lowtoHigh;





}
