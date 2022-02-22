package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.pages.Login;
import ui.pages.Us2;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class Us_2 {


    Us2 us2 =new Us2();
    @And("user hover over Sign in")
    public void userHoverOverSignIn() {
        Actions actions=new Actions(Driver.getDriver());
        WebElement hoverOverElement = us2.hoveroverSignin;
        actions.moveToElement(hoverOverElement).perform();

    }
    @And("clickt Sign In")
    public void clicktSignIn() throws InterruptedException {
        Thread.sleep(1000);
        us2.signin.click();
    }

    @And("write valid e mail")
    public void writeValidEMail() throws InterruptedException {
        Thread.sleep(2000);
       us2.email.sendKeys(ConfigReader.getProperty("email"),  Keys.ENTER);

    }

    @And("write valid Password")
    public void writeValidPassword() {

        us2.password.sendKeys(ConfigReader.getProperty("password"),  Keys.ENTER);


    }

    @And("User should see home")
    public void userShouldSeeHome() {
      //  System.out.println(Driver.getDriver().getTitle());

        Assert.assertTrue(us2.homepage.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='nav-your-amazon']")).isEnabled());
      //  System.out.println(Driver.getDriver().findElement(By.xpath("//*[@id='nav-your-amazon'])")).getText());
        //Assert.assertTrue(Driver.getDriver().getTitle().contains("Registry"));
    }

    //tc3
    @And("write invalid Password")
    public void writeInvalidPassword() {

        Driver.getDriver().findElement(By.xpath("(//*[@id='ap_password'])[1]")).sendKeys("WERTY12345." ,  Keys.ENTER);

    }

    @When("see Error Message")
    public void see_Error_Message() {
        Assert.assertTrue(Driver.getDriver().findElement(By.id("auth-error-message-box")).getText().contains("There was a problem"));


    }

    //tc4
    @When("write invalid e mail")
    public void write_invalid_e_mail() {
        Driver.getDriver().findElement(By.xpath("(//*[@id='ap_email'])[1]")).sendKeys("emag44455@alfaceti.com" ,  Keys.ENTER);


    }

    @When("clickt Continue")
    public void clickt_Continue() {


    }

//    @When("see Error Message")
//    public void see_Error_Message() {
//        Assert.assertTrue(Driver.getDriver().findElement(By.cssSelector("#auth-error-message-box")).getText().contains("There was a problem"));
//
//
//    }
}
