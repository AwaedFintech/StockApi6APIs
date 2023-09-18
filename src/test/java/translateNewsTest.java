import APIs.NewsSymbols;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class newsSymbolsTest {

    @Test
    public static void NewsSymbolsHappyScenario(){

        NewsSymbols yz = new NewsSymbols();

        Response response = yz.nwsbl("AMZN");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
