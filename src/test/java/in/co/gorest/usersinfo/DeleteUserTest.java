package in.co.gorest.usersinfo;

import in.co.gorest.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest extends TestBase {

    @Test
    public void deleteTheStudent() {
        given().log().all()
                .header("Accept","application/json")
                .header("Content-type","application/json")
                .header("Authorization","Bearer e832a705655493c7e143306a74ee223819a9c96b6376f7603bcebd4887434d6e")
                .pathParam("id", 7595900)
                .when()
                .delete("/users/{id}")
                .then().log().all()
                .statusCode(204);
    }

}
