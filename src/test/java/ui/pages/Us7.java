package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Us7 {

    public Us7(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='https://music.amazon.com?ref=dm_aff_amz_com'])[1]")
    public WebElement music;

    @FindBy(xpath = "//table[@class='navFooterMoreOnAmazon']//tr//td")
    public List<WebElement> buttomDynamic;



}
