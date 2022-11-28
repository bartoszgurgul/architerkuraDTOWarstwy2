package pl.javastart.restassured.test;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pl.javastart.restassured.test.model.Message;

import static io.restassured.RestAssured.given;

public class FirstRestAssuredAutomatedTest {

    @Test
    public void givenNonExistingPetIdWhenGetPetThenPetNotFoundTest(){
        given().when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/0").then().statusCode(404);
    }


}
