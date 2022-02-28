package y2021m12.d03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("First key", 1);
        myMap.put("Second key", 2);
        myMap.put("Third key", 3);
        myMap.put("Fifth key", 5);
//        myMap.put("First key", 6); -- átírná 1-ről 6-ra
        myMap.size(); // map mérete: 4
        myMap.get("First key"); //key-hez tartozó érték: 1



    }
}
