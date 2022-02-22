package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class Us2 {
    public Us2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement hoveroverSignin;
    @FindBy(xpath = "(//*[@class='nav-action-inner'])[1]")
    public WebElement signin;
    @FindBy(xpath = "(//*[@id='ap_email'])[1]")
    public WebElement email;
    @FindBy(xpath = "(//*[@id='ap_password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//*[@id='nav-your-amazon']")
    public WebElement homepage;
}

