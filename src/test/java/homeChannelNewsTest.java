import APIs.Home;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class homeTest {

    @Test
    public static void HomeHappyScenario(){

        Home hme = new Home();

        Response response = hme.hm();
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
