package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us8 {




        public Us8(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//span[normalize-space()='Create a List']")
        public WebElement shopppingList1;

    @FindBy(xpath = "(//input[@type='submit'])[8]")
    public WebElement shopppingList2;

    @FindBy(xpath = "//span[@id='profile-list-name']")
    public WebElement shopppingList3;

    @FindBy(xpath = "//input[@class='a-input-text fix-width-x-large']")
    public WebElement expectednameofShoppingList;



    @FindBy(id = "profile-list-name")
    public WebElement actualnameofShoppingList;

    @FindBy(xpath = "//div[@class='wl-list ']")
    public List<WebElement> actualnameofShoppingListList;

    @FindBy(id = "overflow-menu-popover-trigger")
    public WebElement more;


    @FindBy(id = "editYourList")
    public WebElement manageList;

    @FindBy(xpath = "(//input[@type='submit'])[9]")
    public WebElement delete;

    @FindBy(xpath = "//span[@id='list-delete-confirm']")
    public WebElement deleteYes;










}
