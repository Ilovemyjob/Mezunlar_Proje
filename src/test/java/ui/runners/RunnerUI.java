package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

    plugin = {
        "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
    },
    //Path of the feature folder
    features = "src/test/resources/uiFeatures",
    //Path of the step definition folder
    //  tags = "@flowersearch",
    tags = "@1",
    glue= "ui/stepdefinitions",
    dryRun = false

            // dryRun = false means it runs the test cases and generate teh missing step definitions.
            // dryRun= true means it doesn't run the test cases but only generate the missing step definition.

            )
    public class RunnerUI {
//Runner class is to Run the feature files==like @Test or main method
        //This runner class is also used to configure and control the framework



    }
