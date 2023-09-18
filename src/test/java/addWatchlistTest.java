import APIs.Login;
import APIs.Symbols;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class symbolsTest {

    @Test
    public static void SymbolsHappyScenario(){

        Symbols ss = new Symbols();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = ss.symb(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
