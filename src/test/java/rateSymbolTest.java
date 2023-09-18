import APIs.EarnSymbol;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class earnSymbolTest {

    @Test
    public static void EarningsSymbolHappyScenario(){

        EarnSymbol ensymb = new EarnSymbol();

        Response response = ensymb.ern("TSLA");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
