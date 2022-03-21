package api.stepdefinitions;

import api.utilities.ExcelUtil;
import api.utilities.ReadToTxt;
import api.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;
import ui.utilities.Log;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US02_GetBoard extends TestBase {

    Response response;
    Map<String,String> expectedData;
     JsonPath actual;

    String id;
    String id2;



    @Given("User Read from the Created Board {string}")
    public void user_Read_from_the_Created_Board(String boardName) {
// text dosyasindan okuma
        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("id")))){
         id = reader.readLine();
            System.out.println(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
//excel dosyasindan okuma,datalar her calistirilinca silip yeniden yazilmasi lazim,daha dynamic olabilir
        //yazdiriyor ama kullanirken hata veriyor.
        char[] ids = new char[1000];
        try (FileReader readerExcel = new FileReader(ConfigReader.getProperty("idExcel"))){
           readerExcel.read(ids);
        } catch (IOException e) {
            e.printStackTrace();
        }
        id2  = new String(ids);
        System.out.println(id2);


//excelutil classi kullanarak excel data cagirmak,ama basarili olamadim
//        ExcelUtil excelUtil = new ExcelUtil(ConfigReader.getProperty("idExcel"), "idExcelData");
//        List<Map<Object, Object>> data = excelUtil.getDataList();
//        System.out.println(data);

        Log.startTestCase("trelloGet");

        expectedData = new HashMap<>();
        expectedData.put("id",id);//Dynamic
        expectedData.put("name",boardName);//Dynamic
        expectedData.put("permissionLevel","private");
        Log.info("created expectedData");
        System.out.println(expectedData.get("id"));

        setUp01();
        spec01.pathParams("parametre1", "1",
                "parametre2", "boards",
                "id", id).//diger class tan alindi dynamic yapmak icin
                queryParams("key", ConfigReader.getProperty("key"),
                "token", ConfigReader.getProperty("token"));
        Log.info("set up Url");

        response = given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().
                get("/{parametre1}/{parametre2}/{id}");

        Log.info("send response");


        response.prettyPrint();
        System.out.println(ConfigReader.getProperty("id"));




        actual = response.jsonPath();
        Log.info("created actual");
    }
    @Given("Assert id")
    public void assert_id() {
        System.out.println(actual.get("id"));

        Assert.assertEquals(expectedData.get("id"),actual.get("id"));
        Log.info("Assert id");

        Log.info("Assert private");


    }

    @Given("Assert getRequest status code")
    public void assert_getRequest_status_code() {

        Assert.assertEquals(200,response.statusCode());
        Log.info("Assert statusCode");


    }
}
