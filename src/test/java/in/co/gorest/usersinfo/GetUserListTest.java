package in.co.gorest.usersinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserListTest extends TestBase {

    @Test
    public void getAllUsers() {
        Response response = given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
    }


}
