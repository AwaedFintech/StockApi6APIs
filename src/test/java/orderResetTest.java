import APIs.Login;
import APIs.PerfSymb;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class perfSymbolTest {

    @Test
    public static void PerfomanceSymbolsHappyScenario(){

        PerfSymb pfsym = new PerfSymb();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response rsp = pfsym.prfmnce(token, "NVDA");
        rsp.body().prettyPrint();
        rsp.then().statusCode(200);
}
}
