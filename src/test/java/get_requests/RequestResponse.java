package get_requests;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;

public class RequestResponse {
    public static void main(String[] args) {

        //Get request nasil yapilir
        String url= "https://restful-booker.herokuapp.com/booking/55";
        Response response= get(url);
        response.prettyPrint(); //method reponse datayi yazdirir

        //Print  Status Code
        System.out.println("Status code: "+response.statusCode());
        // How to print Content Type
        System.out.println("Content Type: "+response.contentType());

        System.out.println("Status Line: "+response.statusLine());
        System.out.println(response.header("Connection"));
        System.out.println("Headers: "+response.headers());
        //Time nasıl yazdırılır
        System.out.println("Time: "+response.getTime());


    }

}
    /*
    1)Postman manuel API testi için kullanilir.
    2)API otomasyonu için Rest-Assured Library kullanacagiz.
    3)Otomasyon kodlarının yazımı için şu adımları izliyoruz:
       a) Gereksinimleri anlama
       b) Test case i yazma:
          -Test case i yazmak için "Gherkin Language" kullaniyoruz.
           x) Given: Ön koşullar  --> Endpoint, body
           y) When : İşlemlee --> Get,Put,Delete...
           z) Then : Dönütler --> Assert
           t) And --> Çoklu işlemlerin art arda yazilacağı yerlerde kullanilir.
        c) Test kodunu yazarken şu adımları izleriz:
           i)    Set the URL
           ii)   Set the expected data
           iii)  Send the request and get the response
           iv)   Do assertion

     */

