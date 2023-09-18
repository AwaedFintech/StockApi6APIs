import APIs.NewsID;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class newsIDTest {

    @Test
    public static void NewsIDHappyScenario(){

        NewsID nwsid = new NewsID();

        Response response = nwsid.nws("648a3873ce4c85acee6856ac");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
