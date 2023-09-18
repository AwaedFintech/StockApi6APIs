import APIs.Categories;
import APIs.SymSymbol;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class symbolsInfoTest {

    @Test
    public static void viewSymbolsInfoHappyScenario(){

        SymSymbol SymbInfo = new SymSymbol();

        Response response = SymbInfo.symbolsInfo("META");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
