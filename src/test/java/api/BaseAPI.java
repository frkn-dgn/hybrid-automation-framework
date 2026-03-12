package api;

import io.restassured.RestAssured;

public class BaseAPI {

    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

}