package api.stepdefinitions;

import api.utilities.RequestPojo;
import api.utilities.ResponsePojo;
import api.utilities.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US08_CreateBoardwithPojo extends TestBase {

    Response response;
    ResponsePojo responsePojo;

    @Given("Post request for create {string} with pojo")
    public void postRequestForCreateWithPojo(String boards) {
        setUp01();
        spec01.pathParams("parametre1", 1,
                "parametre2", "boards"
        );

        RequestPojo requestPojo = new RequestPojo(boards,ConfigReader.getProperty("key"),ConfigReader.getProperty("token"));
        response = given().
                contentType(ContentType.JSON).
                spec(spec01).
                body(requestPojo).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();

    }

    @Given("get response with pojo")
    public void get_response_with_pojo() {

        responsePojo = response.as(ResponsePojo.class);

        System.out.println(responsePojo.getId());
        System.out.println(responsePojo.getName());



    }


    @And("assert pojo {string}")
    public void assertPojo(String boards) {

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(boards,responsePojo.getName());


    }
}
