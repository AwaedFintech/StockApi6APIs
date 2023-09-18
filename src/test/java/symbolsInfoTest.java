import APIs.Categories;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class categoriesTest {

    @Test
    public static void viewCategoriesHappyScenario(){

        Categories ctgry = new Categories();

        Response response = ctgry.categories();
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
