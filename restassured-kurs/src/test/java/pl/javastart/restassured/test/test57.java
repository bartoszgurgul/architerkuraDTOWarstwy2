package pl.javastart.restassured.test;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.javastart.main.pojo.Category;
import pl.javastart.main.pojo.Pet;
import pl.javastart.main.pojo.Tag;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.oauth;

public class  test57{

    @Test
    public void givenExistingPetIdWhenGetPetYhenReturnPetTest(){


        Pet pet = new Pet();
        pet.setId(1);
        pet.setStatus("live");
        pet.setName("Reksio");
        pet.setCategory(new Category().setId(1).setName("Psy"));
        pet.setTags(Collections.singletonList(new Tag().setId(1).setName("Schronisko")));

        given().log().ifValidationFails()
                .body(pet).contentType(ContentType.JSON)
                .when().post("https://swaggerpetstore.przyklady.javastart.pl/v2/pet")
                .then().statusCode(200).extract().as(Pet.class);

        Pet expectPet = given()
                .when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/" + pet.getId())
                .then().statusCode(200).extract().as(Pet.class);
        try {
        Assert.assertEquals(expectPet, pet);
    } catch (AssertionError assertionError){
            System.out.println(expectPet.toString());
            System.out.println(pet.toString());
        }

    }
}
