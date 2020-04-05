package stepsDefinition;

import cucumber.api.java.en.Given;

import static io.restassured.RestAssured.given;

public class NotFound {

    @Given("^Que eu faça um GET errado$")
    public void que_eu_faça_um_GET_errado() throws Throwable {

        given()
                .when()
                .get("https://logandroid.herokuapp.com/api/")

                .then()
                .log().all()
                .statusCode(404)
        ;

    }


}
