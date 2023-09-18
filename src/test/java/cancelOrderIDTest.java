import APIs.Login;
import APIs.OrderReset;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class orderResetTest {

    @Test
    public static void OrderResetHappyScenario(){

        OrderReset ordrst = new OrderReset();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966588088014", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response rsp = ordrst.ordr(token, "648ea16fd83d87fd673914a5", "en");
        rsp.body().prettyPrint();
        rsp.then().statusCode(200);
}
}
