import APIs.AboutSymbol;
import APIs.Symbols;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class aboutSymbolTest {

    @Test
    public static void AboutSymbolsHappyScenario(){

        AboutSymbol abtss = new AboutSymbol();

        Response response = abtss.Abt("META");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
