package api;

import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UserAPI extends BaseAPI {

    public static int createUser() {

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body("{ \"name\": \"Furkan\", \"username\": \"furkanqa\" }")
                        .when()
                        .post("/users")
                        .then()
                        .extract().response();

        System.out.println("Response:");
        System.out.println(response.asString());

        return response.jsonPath().getInt("id");
    }

}