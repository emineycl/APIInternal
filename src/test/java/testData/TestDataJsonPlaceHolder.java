package testData;
import org.json.JSONObject;

import java.util.HashMap;

public class TestDataJsonPlaceHolder {

    public int basariliStatusCode = 200;

    public JSONObject expectedDataOlustur(){

        JSONObject expDataJson = new JSONObject();

        expDataJson.put("userId",3);
        expDataJson.put("id",22);
        expDataJson.put("title","dolor sint quo a velit explicabo quia nam");
        expDataJson.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");
        return expDataJson;
    }
    public HashMap requestBodyOlusturMap(){

        HashMap <String,Object> requestBodyMap = new HashMap<>();

        requestBodyMap.put( "title","Ahmet");
        requestBodyMap.put( "body","Merhaba");
        requestBodyMap.put( "userId",10);
        requestBodyMap.put( "id",70);

        return  requestBodyMap;
    }
}