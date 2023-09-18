import APIs.Login;
import APIs.AddWatchlist;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class addWatchlistTest {

    @Test
    public static void AddWatchlistHappyScenario(){

        AddWatchlist ijgfi = new AddWatchlist();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response rsp = ijgfi.adwatch(token, "TSLA");
        rsp.body().prettyPrint();
        rsp.then().statusCode(200);
}
}
