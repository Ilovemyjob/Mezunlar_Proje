package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import ui.pages.Us8;

public class Us_8 {


    Us8 us8 = new Us8();
    String expected;
    String actual;

    @When("User clickt Create a List")
    public void user_clickt_Create_a_List() {

    us8.shopppingList1.click();

    }
    @When("User clickt Create a List second time")
    public void user_clickt_Create_a_List_second_time() {
        us8.shopppingList2.click();

        System.out.println(us8.expectednameofShoppingList.getAttribute("value"));
        expected =us8.expectednameofShoppingList.getAttribute("value");
    }

    @When("User see  Shopping List Page")
    public void user_see_Shopping_List_Page() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("-------");
        System.out.println(us8.actualnameofShoppingList.getText());
       // Assert.assertTrue(us8.shopppingList3.isDisplayed());

        actual = us8.actualnameofShoppingList.getText();
        Assert.assertTrue(expected.equals(us8.shopppingList3.getText()));// more dynamic

//       for (int i = 0; i < us8.actualnameofShoppingListList.size(); i++) {
//     //    Assert.assertTrue(us8.actualnameofShoppingListList.get(i).getText().contains(us8.expectednameofShoppingList.getText()));
//
//           System.out.println(us8.actualnameofShoppingListList.get(i).getText());
          //  System.out.println("----");
          //  System.out.println(us8.expectednameofShoppingList.getText());
      //  }


    }
    @When("User got More")
    public void user_got_More() {

        us8.more.click();



    }

    @And("User go to Manage LIst")
    public void userGoToManageLIst() {
        us8.manageList.click();
    }

    @And("User delete List")
    public void userDeleteList() throws InterruptedException {
        us8.delete.click();
        Thread.sleep(2000);
        us8.deleteYes.click();

    }

    @And("user should not see List")
    public void userShouldNotSeeList() throws InterruptedException {


        Thread.sleep(2000);
        for (int i = 0; i < us8.actualnameofShoppingListList.size(); i++) {

            Assert.assertFalse(us8.actualnameofShoppingListList.get(i).getText().contains(actual));
        }

        

    }
}
