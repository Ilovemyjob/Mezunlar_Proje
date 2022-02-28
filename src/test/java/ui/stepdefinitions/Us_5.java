package ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import ui.pages.Us5;

public class Us_5 {

    Us5 us5 = new Us5();
    @When("User clickt low to high Filter")
    public void user_clickt_low_to_high_Filter() {

        us5.sortBy.click();

        us5.lowtoHigh.click();



    }

    @When("User should see all options increasingly")
    public void user_should_see_all_options_increasingly() {



    }







}
