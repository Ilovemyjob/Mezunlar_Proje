package api.stepdefinitions;

import api.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US01_CreateBoard extends TestBase {

    Response response;

    JsonPath actual;

    Map<String,String> expectedData;

   // String id= ConfigReader.getProperty("id");
   // String id;
  // List<String> id = new ArrayList<>();//diger classlardan gormuyor


    @Given("send post request for create {string}")
    public void sendPostRequestForCreate(String board) {
        setUp01();
        spec01.pathParams("parametre1", 1,
                "parametre2", "boards"
        );

        expectedData = new HashMap<>();
        expectedData.put("key","cdc998837b8c95c7e51fa894993b55af");
        expectedData.put("token","26c0f5970718541a115659ca43666e97422f71a661282dee0a8ba6820127af5e");
        expectedData.put("name",board);

        System.out.println(expectedData);

        response = given().
                contentType(ContentType.JSON).
                spec(spec01).
                body(expectedData).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        actual = response.jsonPath();

        //id = actual.getString("id");//diger classlarda kulllanma icin yapildi
      //  this.id.add(response.jsonPath().getString("id"));


        System.out.println(actual.getString("id"));

        try {
            PrintWriter clean = new PrintWriter(ConfigReader.getProperty("id"));
            clean.print("");
            BufferedWriter writer = new BufferedWriter(new FileWriter(ConfigReader.getProperty("id"), true));
            writer.append(actual.getString("id"));
            System.out.println(writer.toString());
                    writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter file = new FileWriter(ConfigReader.getProperty("id"));
            file.flush();
            BufferedWriter writer = new BufferedWriter(new FileWriter(ConfigReader.getProperty("idExcel")));
            writer.write(actual.getString("id"));
            System.out.println(writer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    @Given("Assert name {string}")
    public void assert_name(String board) {

     //   Assert.assertEquals(board, json.getString("name"));//2. yol
        Assert.assertEquals(expectedData.get("name"), actual.getString("name"));


    }



    @Given("Assert status code {int}")
    public void assert_status_code(int status) throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertEquals(status, 200);
        Assert.assertEquals(200,response.statusCode());




    }



}
