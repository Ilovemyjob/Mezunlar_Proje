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
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US03_PutBoard extends TestBase {

    Response response;

    JsonPath actual;

    Map<String,String> expectedData;

String id;
    @Given("User change the name {string} to the {string}")
    public void userChangeTheNameToThe(String arg0, String name) {

        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("id")))){
            id = reader.readLine();
            System.out.println(id);
        } catch (IOException e) {
            e.printStackTrace();
        }


        expectedData = new HashMap<>();
        expectedData.put("name",name);
      //  expectedData.put("token","26c0f5970718541a115659ca43666e97422f71a661282dee0a8ba6820127af5e");



        setUp01();
        spec01.pathParams("parametre1", "1",
                "parametre2", "boards",
                "id", id).
                queryParams("key", ConfigReader.getProperty("key"),
                        "token", ConfigReader.getProperty("token"));


        response =given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().body(expectedData).
                put("/{parametre1}/{parametre2}/{id}");
        response.prettyPrint();

        actual = response.jsonPath();


    }


    @Given("Assert name is {string}")
    public void assert_name_is(String name) {

        Assert.assertEquals(expectedData.get("name"),actual.getString("name"));
     //   Assert.assertEquals(name,actual.getString("name"));//2.way



    }


}
