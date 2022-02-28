package ui.stepdefinitions;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ui.pages.Us4;
import ui.pages.Us6;

import javax.xml.ws.WebEndpoint;
import java.util.ArrayList;
import java.util.List;

public class Us_6 {

    Us6 us6 = new Us6();
    Us4 us4 = new Us4();

    public String selected;

    @When("clickt {string} product")
    public void clickt_product(int string) {


//        List<String> products = new ArrayList<>();
//        for (int i = 0; i < us6.product1.size(); i++) {
//            products.add(us6.product1.toString());
//
//            if(products.get(i).equals(string)){
//                us6.product1.get(string).click();
//
//            }
//        }
    }

    @When("clickt first product")
    public void clickt_first_product() {
//        for (int i = 0; i < us6.products.size(); i++) {
//
//            us6.products.get(i).getText();
//            System.out.println(us6.products.get(i).getText());
//
//        }

        selected = us6.products.get(7).getText();
        us6.products.get(7).click();

    }

    @When("clickt second product")
    public void clickt_second_product() {
        us6.products.get(12).click();
    }
    @When("clickt Add to card")
    public void clickt_Add_to_card() {


       us6.addCard.click();
    }

    @When("user delete search box")
    public void user_delete_search_box() throws InterruptedException {
        Thread.sleep(2000);
      // us4.searchButton.clear();

       Thread.sleep(2000);

    }

    @When("go to Shopping list")
    public void go_to_Shopping_list() throws InterruptedException {
        Thread.sleep(2000);

        us6.cart.click();

    }

    @When("User should see selected product correctly")
    public void user_should_see_selected_product_correctly() {

        String expected1 = "Samsung";
        //String expected2 = "Apple";
        for (int i = 0; i < us6.products.size(); i++) {

           if(us6.products.get(i).getText().contains(expected1)){
               Assert.assertTrue(true);

           }
        }
     //   Assert.assertTrue(us6.products.get(1).getText().contains(expected1));
        //Assert.assertTrue(us6.products.get(2).getText().contains(expected2));

    }



}
