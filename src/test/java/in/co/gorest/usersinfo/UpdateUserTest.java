package in.co.gorest.usersinfo;

import in.co.gorest.model.UsersPojo;
import in.co.gorest.testbase.TestBase;
import in.co.gorest.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserTest extends TestBase {

    @Test
    public void updateUser() {
        String email = TestUtils.getRandomValue() + "prime11@gmail.com";

        UsersPojo usersPojo = new UsersPojo();
        usersPojo.setName("ppuu");
        usersPojo.setEmail(email);
        usersPojo.setGender("female");
        usersPojo.setStatus("active");

        Response response=given().log().all()
                .header("Accept","application/json")
                .header("Content-type","application/json")
                .header("Authorization","Bearer e832a705655493c7e143306a74ee223819a9c96b6376f7603bcebd4887434d6e")
                .pathParam("id",7597567)
                .when()
                .body(usersPojo)
                .patch("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
