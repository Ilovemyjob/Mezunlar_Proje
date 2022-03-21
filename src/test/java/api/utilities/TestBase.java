package api.utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBase {
    protected RequestSpecification spec01;

    public void setUp01() {

        spec01 = new RequestSpecBuilder().  //new+constructur
                setBaseUri("https://api.trello.com").
                build();
    }
}
