package ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.Us7;
import ui.utilities.Driver;

public class Us_7 {

    Us7 us7 = new Us7();
    @When("go to Buttom of page")
    public void go_to_Buttom_of_page() throws InterruptedException {

        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        actions.sendKeys(Keys.END);



    }



    @When("User clickt {string}")
    public void user_clickt(String string) {

      //  us7.music.click();hard code
        for (int i = 0; i < us7.buttomDynamic.size(); i++) {

            if(us7.buttomDynamic.get(i).getText().contains(string)){
                us7.buttomDynamic.get(i).click();

            }
          //  System.out.println(us7.buttomDynamic.get(i).getText());


        }

    }
    @When("user should be able to see {string} page")
    public void user_should_be_able_to_see_page(String string) {

        for (int i = 0; i < us7.buttomDynamic.size(); i++) {

            if (string.equals(Driver.getDriver().getTitle())) {
                Assert.assertTrue(true);

            }

        }


    }}
