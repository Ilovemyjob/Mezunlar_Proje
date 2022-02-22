package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us4 {

    public Us4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement search;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(className = "a-section a-spacing-none s-padding-right-small s-title-instructions-style")
    public List<WebElement> searchedWord;




}
