package ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.Us4;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Us_4 {
    Us4 us4 = new Us4();
    @When("User clickt search buttom")
    public void user_clickt_search_buttom() {







    }

    @When("User write a Words {string}")
    public void user_write_a_Words(String string) {
        us4.search.sendKeys(string,Keys.ENTER);

    }

    @When("User see searched word {string} in all options")
    public void user_see_searched_word_in_all_options(String string) {

        List<String> actual = new ArrayList<>();

//        for (WebElement each: us4.searchedWord
//        ) {
//            actual.add(each.getText());
//
//
//        }

        for (int i = 0; i <us4.searchedWord.size() ; i++) {
            actual.add(us4.searchedWord.get(i).getText());

            for (int j = 0; j <us4.searchedWord.size() ; i++) {
                Assert.assertTrue(actual.get(i).contains(string));

            }

        }
        System.out.println(actual);
       // Assert.assertTrue(actual.contains(string));


    }







}
