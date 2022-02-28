package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class Us9 {

    public Us9(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "wishlistButtonStack")
    public WebElement addShoppingList;


    @FindBy(id = "WLHUC_result_success")
    public WebElement successMessage;

    @FindBy(xpath = "//span[contains(text(),'View Your List')]")
    public WebElement viewList;

    @FindBy(xpath = "(//div[@class='a-section'])[4]")
    public WebElement addedProduct;





}
