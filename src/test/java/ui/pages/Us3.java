package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us3 {

    public Us3() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
        public WebElement All;

        @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li")
        public List<WebElement> AllOptions;

        @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li")
        public List<WebElement> selectedOption;
    }
