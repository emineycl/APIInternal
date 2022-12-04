package test;

import io.restassured.internal.RequestSpecificationImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

public class C22_Put_DeSerialization {
 /*
    https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki
    body’e sahip bir PUT request yolladigimizda donen response’in
    response body’sinin asagida verilen ile ayni oldugunu test ediniz
    Request Body
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
    Expected Data :
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
     */

    RequestSpecificationImpl specJsonPlace;

    @Test
    public void put(){

        // 1- Request icin URL ve Body hazirla


        specJsonPlace.pathParams("posts","pp",70);

        HashMap<String, Object> requestBodyMap= new HashMap<>();

        requestBodyMap.put("title","Ahmet");
        requestBodyMap.put("body","Merhaba");
        requestBodyMap.put("userId",10);
        requestBodyMap.put("id",70);



    }

}