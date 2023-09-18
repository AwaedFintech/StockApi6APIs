import APIs.TransSymbol;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class translateSymbolTest {

    @Test
    public static void TranslateSymbolsHappyScenario(){

        TransSymbol tran = new TransSymbol();

        Response response = tran.trans("AMZN");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
