package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import ui.pages.Us1;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.Log;


public class Us_1 {

    Us1 us_1 = new Us1();



    @When("User go to Amazon site")
    public void userGoToAmazonSite() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Log.startTestCase("anasayfa açıldı");

    }

    @And("User can go to site")
    public void userCanGoToSite() {
        //System.out.println(Driver.getDriver().getTitle());



        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Log.info("user amazon sayfasinda");
    }
}
