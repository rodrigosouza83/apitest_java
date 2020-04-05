package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static io.restassured.RestAssured.given;

public class GetMethod {

    @Given("^Que eu faça uma GET$")
    public void que_eu_faça_uma_GET() throws Throwable {

        given()
                .when()
                .get("https://logandroid.herokuapp.com/api/alunos")

                .then()
                .log().all()
                .statusCode(200)
        ;


    }

    @Then("^Status code será (\\d+)$")
    public void status_code_será(int arg1) throws Throwable {

        System.out.println(200);
    }

}
