package testing.apirest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test01_GetMethod {

    @Test

    public void consultarDadosAPI() {

        given()
                .when()
                .get("https://logandroid.herokuapp.com/api/alunos")

                .then()
                .log().all()
                .statusCode(200)
                ;

    }

}
