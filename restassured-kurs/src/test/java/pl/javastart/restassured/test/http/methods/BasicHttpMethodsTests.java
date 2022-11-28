package pl.javastart.restassured.test.http.methods;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pl.javastart.main.pojo.Category;
import pl.javastart.main.pojo.Pet;
import pl.javastart.main.pojo.Tag;

import java.util.Collections;

import static io.restassured.RestAssured.given;

public class BasicHttpMethodsTests {

    @Test
    public void givenPetWhenPostPetThenPetIsCreatedTest(){
        Category category = new Category();
        category.setId(123);
        category.setName("Ssak");

        Tag tag = new Tag();
        tag.setId(1);
        tag.setName("test");

        Pet pet = new Pet();
        pet.setCategory(category);
        pet.setId(1);
        pet.setStatus("Zywe");
        pet.setPhotoUrls(Collections.singletonList("http://photos.com/dog1.jpg"));
        pet.setTags(Collections.singletonList(tag));

        given().log().all().body(pet).contentType(ContentType.JSON)
                .when().post("https://swaggerpetstore.przyklady.javastart.pl/v2/pet")
                .then().log().all().statusCode(200);


    }
}
