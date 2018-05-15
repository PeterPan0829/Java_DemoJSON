package JSON_Test;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class demo {

    public static void main(String[] args) {

                 //利用 Peoplebean 來產生一個對應的 JSONObject
                 PeopleBean Mary = new PeopleBean("Mary", 20, false);
                 JSONObject jsonObjectMary = new JSONObject(Mary);
                 System.out.println("1: " + jsonObjectMary);

                 //利用 map 的對照來產生JSONObject
                 Map map = new HashMap();
                 map.put("name", "Jacky");
                 map.put("age", 30);
                 map.put("gender", true);
                 JSONObject jsonObjectJacky = new JSONObject(map);
                 System.out.println("2: " + jsonObjectJacky);

                 //每個 JSONObject 都能利用JSONObject.put(key, value) 來增加屬性
                 jsonObjectJacky.put("height", 180);
                 System.out.println("3: " + jsonObjectJacky);

                 // 利用 JSON 的字串產生 JSONObject
                 String jackyJsonString = jsonObjectJacky.toString();
                 JSONObject jsonObjectJackyFromString = new JSONObject(jackyJsonString);


                 // JSONObject.get(key) 可取得 JSONObject中對應的值
                 // 找不到的話會丟出 org.json.JSONException如下面註解掉那行
                 System.out.println("4: " + jsonObjectJackyFromString.get("name"));
                 System.out.println(jsonObjectJackyFromString.get("weight")); // 這行

                 // 由JSONObject.names()取回names的JSONArray
                 JSONArray jsonArrayNames = jsonObjectJacky.names();
                 System.out.println("5: " + jsonArrayNames);


                 // JSONArray可藉由JSONArray.put(value) 來增加Array中的值
                 jsonArrayNames.put("weight");
                 System.out.println("6: " + jsonArrayNames);
             }

    }

