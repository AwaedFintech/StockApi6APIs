import APIs.RatingSymb;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class rateSymbolTest {

    @Test
    public static void RatingSymbolHappyScenario(){

        RatingSymb rasymb = new RatingSymb();

        Response response = rasymb.rate("META");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
