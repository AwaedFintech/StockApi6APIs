import APIs.Login;
import APIs.RemoveWatchlist;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class removeWatchlistTest {

    @Test
    public static void RemoveWatchlistHappyScenario(){

        RemoveWatchlist rmv = new RemoveWatchlist();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response rsp = rmv.rvewatch(token, "TSLA");
        rsp.body().prettyPrint();
        rsp.then().statusCode(200);
}
}
