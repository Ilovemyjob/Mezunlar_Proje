package api.stepdefinitions;

import api.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US05_CreateList extends TestBase {


    Response response;
    Map<String, Object> actual;
    Map<String,String> expected;

    String id;

    @Given("User create a list name as {string}")
    public void user_create_a_list_name_as(String listName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("id")))){
            id = reader.readLine();
            System.out.println(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

    setUp01();
    spec01.pathParams("parametre1", "1",
            "parametre2", "lists").
            queryParams("name", listName,
            "idBoard",id,
                    "token", ConfigReader.getProperty("token"),
                    "key", ConfigReader.getProperty("key"));

        expected = new HashMap<>();
        expected.put("idBoard",id);
        expected.put("name",listName);//featuredan isim verdim
        expected.put("key",ConfigReader.getProperty("key"));
        expected.put("token",ConfigReader.getProperty("token"));

        response = given().
                contentType(ContentType.JSON).
                spec(spec01).
                body(expected).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();

        actual = response.as(HashMap.class);

        try {
            PrintWriter clean = new PrintWriter(ConfigReader.getProperty("List_ids"));
            clean.print("");
            BufferedWriter writer = new BufferedWriter(new FileWriter(ConfigReader.getProperty("List_ids"), true));
            writer.append(actual.get("id").toString());
            System.out.println(writer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    @Given("Assert status code for list is {int}")
    public void assert_status_code_for_list_is(int status) {

        Assert.assertEquals(response.getStatusCode(),status);

    }

    @Given("Assert name of list is {string}")
    public void assert_name_of_list_is(String string) {

        Assert.assertEquals(actual.get("name"),expected.get("name"));



    }
}
