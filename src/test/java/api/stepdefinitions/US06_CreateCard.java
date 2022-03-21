package api.stepdefinitions;

import api.utilities.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class US06_CreateCard extends TestBase {

    Map<String,String> expectedData;

    Response response;
    Map<String, Object> actual;

    String Listid;

    ///https://api.trello.com/1/cards?idList=6228fb872b95fa3025a6db82&name=my Card&key={{key}}&token={{token}}

    @Given("User create a Card {string}")
    public void user_create_a_Card(String cardName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("List_ids")))){
            Listid = reader.readLine();
            System.out.println(Listid);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setUp01();
        spec01.pathParams("parametre1", 1,
                "parametre2", "cards"
        );
        expectedData = new HashMap<>();
        expectedData.put("idList", Listid);
        expectedData.put("name",cardName);
        expectedData.put("key","cdc998837b8c95c7e51fa894993b55af");
        expectedData.put("token","26c0f5970718541a115659ca43666e97422f71a661282dee0a8ba6820127af5e");


        response = given().
                contentType(ContentType.JSON).
                spec(spec01).
                body(expectedData).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();


    }

    @Given("Assert status code of card is {int}")
    public void assert_status_code_of_card_is(int status) {

        Assert.assertEquals(response.getStatusCode(),status);

    }


    @And("Assert {string} is created")
    public void assertIsCreated(String cardName) {

        actual = response.as(HashMap.class);

        Assert.assertEquals(actual.get("name"),cardName);



    }
}
