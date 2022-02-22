package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class Us_1 {


    @When("User go to Amazon site")
    public void userGoToAmazonSite() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @And("User can go to site")
    public void userCanGoToSite() {
        //System.out.println(Driver.getDriver().getTitle());


        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
    }
}
