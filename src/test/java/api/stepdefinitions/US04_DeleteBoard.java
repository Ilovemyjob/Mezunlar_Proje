package api.stepdefinitions;

import api.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US04_DeleteBoard extends TestBase {

    Response response;

    JsonPath actual;

    US01_CreateBoard idObj = new US01_CreateBoard();

    String id;
    @Given("User delete the created Board")
    public void user_delete_the_created_Board() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("id")))){
            id = reader.readLine();
            System.out.println(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setUp01();
        spec01.pathParams("parametre1", "1",
                "parametre2", "boards",
                "id", id).
                queryParams("key", ConfigReader.getProperty("key"),
                        "token", ConfigReader.getProperty("token"));

        response =given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().
                delete("/{parametre1}/{parametre2}/{id}");
        response.prettyPrint();

        actual = response.jsonPath();
    }

    @Given("Assert value is null")
    public void assert_value_is_null() {

        Assert.assertEquals(null,actual.getString("value"));


    }

    @Given("Assert There is no id")
    public void assert_There_is_no_id() {
        Assert.assertEquals(null,actual.getString("id"));


    }
}
