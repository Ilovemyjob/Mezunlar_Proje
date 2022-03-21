package ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ui.pages.Us5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Us_5 {

    Us5 us5 = new Us5();
    @When("User clickt low to high Filter")
    public void user_clickt_low_to_high_Filter() {

        us5.sortBy.click();

        us5.lowtoHigh.click();



    }

    @When("User should see all options increasingly")
    public void user_should_see_all_options_increasingly() {

        List<String> actual = new ArrayList<>();
        // sayilar = new ArrayList<>();

        for (int i = 0; i < us5.priceLowtoHigh.size(); i++) {
            actual.add(us5.priceLowtoHigh.get(i).getText().trim());


          //  List<Integer> sayilar = Collections.singletonList(Integer.parseInt(actual.get(i)));
       //     System.out.println(sayilar);
            //System.out.println(actual.get(i));
            actual.get(i).substring(1);

            System.out.print(actual.get(i).substring(1));

            List<Integer> sayilar = new ArrayList<>();


            for (int j = 0; j < sayilar.size(); j=j+2) {
                sayilar.add(j,j+1);
            }

          //  sayilar.add(Integer.parseInt(actual.get(i)));
            System.out.println(sayilar);
//
//            if(sayilar.get(i) <= sayilar.get(i+1)){
//                Assert.assertTrue(true);
//
//            }




            }

        }




    }







