import APIs.Login;
import APIs.PosPrices;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class posPricesTest {

    @Test
    public static void PositionsWithPricesHappyScenario(){

        PosPrices pricesPS = new PosPrices();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response rsp = pricesPS.psprice(token);
        rsp.body().prettyPrint();
        rsp.then().statusCode(200);
}
}
