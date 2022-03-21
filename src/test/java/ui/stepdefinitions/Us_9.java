package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.AssertionSupport;
import org.junit.Assert;
import ui.pages.Us9;

public class Us_9 {


    Us9 us9 = new Us9();
    Us_6 us_6 = new Us_6();
    @When("User clickt Add to lIst")
    public void user_clickt_Add_to_lIst() {

        us9.addShoppingList.click();


    }

    @And("user see success Message")
    public void userSeeSuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us9.successMessage.isDisplayed());


    }


    @When("usr should see procuct on Shopping List")
    public void usr_should_see_procuct_on_Shopping_List() throws InterruptedException {

        Thread.sleep(2000);
        us9.viewList.click();

        Assert.assertTrue(us9.addedProduct.getText().equals(us_6.selected));




    }

    @When("User clickt Delete")
    public void user_clickt_Delete() {

        us9.delete.click();
    }

    @When("user should see deleted message")
    public void user_should_see_deleted_message() {

        Assert.assertTrue(us9.deleted.isDisplayed());



    }


}
