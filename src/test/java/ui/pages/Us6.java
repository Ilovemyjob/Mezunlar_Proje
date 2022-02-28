package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us6 {

    public Us6(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[*]")
    public List<WebElement> products;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addCard;

    @FindBy(id = "a-truncate-cut")
    public List<WebElement> selectedProducts;

    @FindBy(id = "nav-cart-count-container")
    public WebElement cart;












}
