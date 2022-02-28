package y2021m12.d03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMap {
    public static void main(String[] args) {
        //2021.12.03
        //https://github.com/Strukturavaltas-Backend-2021/collections-presentation/blob/f8f0a5dcf799841a9ea1929e0202a9c4bdd802aa/src/main/java/hu/progmasters/day5/Presentation.java


        //Hozzunk létre egy map-et.
        Map<String, Integer> myMap = new HashMap<>();
        //Adjunk hozzá pár elemet.
        myMap.put("First key", 1);
        myMap.put("Second key", 2);
        myMap.put("Third key", 3);
        myMap.put("Fifth key", 5);

//        Fontos megjegyzés:
//        myMap.put("First key", 6); -- átírná 1-ről 6-ra  !!!

        //1, Irassuk ki a map méretét
        System.out.println("Size: " + myMap.size());

        //2, Irassuk ki egy kulcs value-t (egy értéket)
        System.out.println("Get: " + myMap.get("First key"));

        //3, Irassuk ki, hogy üres-e a map
        System.out.println("Empty? :" + myMap.isEmpty());

        //4, Irassuk ki a konzolra egy bizonyos elemet ha nincs benne a keyekbe (null-t dob vissza, ha nem létezik a key)
        System.out.println("Get: " + myMap.get("First"));

        //4,b New String test -- 00:17:34 - 00:19:33
//        System.out.println("-------------------------");
//        String a = "First key";
//        String b = new String ("First key"); -- ekkor is fölülírja, hiába más a hashCode, sima stringként ugyanaz
//        hashMap.put(b, 15);
//        System.out.println("Get: " + hashMap.get(a));
//        System.out.println("Get: " + hashMap.get(b));
//        System.out.println("-------------------------");


        //5, Iteráljunk végig rajta és irassuk ki a kulcs-érték párokat.
        // myMap.entrySet().iter
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("entrySet: " + entry);
        }

    }
}
