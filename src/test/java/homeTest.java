import APIs.TranslateNews;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class translateNewsTest {

    @Test
    public static void TranslateNewsHappyScenario(){

        TranslateNews tnsnws = new TranslateNews();

        Response response = tnsnws.trns("648a3873ce4c85acee6856a8");
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
