package in.co.gorest.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt(){
        RestAssured.baseURI="https://gorest.co.in";
        RestAssured.basePath="/public/v2";
    }
}
