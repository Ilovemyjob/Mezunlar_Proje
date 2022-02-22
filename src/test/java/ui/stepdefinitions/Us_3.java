package ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ui.pages.Main;
import ui.pages.Us3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Us_3 {

    Us3 us3 = new Us3();
    @When("user go to all")
    public void user_go_to_all() {
        us3.All.click();


    }

    @When("user clickt {string}")
    public <string> void user_clickt(String option) throws InterruptedException {


       // WebElement dropdownElement= (WebElement) main.AllOptions;

//        Select options = new Select((WebElement) main.AllOptions);
//        Thread.sleep(3000);
//        List<WebElement> allOption=options.getOptions();//This gives ALL OFF THE DROPDOWN OPTIONS
//        for (WebElement option:allOption){
//            System.out.println(option.getText());
//        }



          List<String> allOptions = new ArrayList<>();
//        for(WebElement each:main.AllOptions){
//            allOptions.add(each.getText());
//            if (each.equals(option) ) {
//
//            }
//        }
//        System.out.println(allOptions);


        for (int i = 0; i < us3.AllOptions.size() ; i++) {
            if(us3.AllOptions.get(i).getText().equals(option)){
                us3.AllOptions.get(i).click();

            }
        }

    }

    @When("User see all sections")
    public void user_see_all_sections() {

        List<String> expected = new ArrayList<>();
        expected.addAll(Arrays.asList("MAIN MENU", "Electronics", "Accessories & Supplies", "Camera & Photo", "Car & Vehicle Electronics", "Cell Phones & Accessories", "Computers & Accessories", "GPS & Navigation", "Headphones","Home Audio", "Office Electronics", "Portable Audio & Video", "Security & Surveillance", "Service Plans", "Television & Video", "Video Game Consoles & Accessories", "Video Projectors", "Wearable Technology", "eBook Readers & Accessories"));

        System.out.println(expected);
        System.out.println("-------------");

        List<String> actual = new ArrayList<>();
        for (WebElement each : us3.selectedOption) {
            actual.add(each.getText());

        }
        Assert.assertTrue(actual.containsAll(expected));
        System.out.println(actual);


    }


}
