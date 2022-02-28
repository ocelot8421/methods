package y2021m12.d03_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        System.out.print("//1, ");
        System.out.println("Size: " + myMap.size());

        //2, Irassuk ki egy kulcs value-t (egy értéket)
        System.out.print("//2, ");
        System.out.println("Get: " + myMap.get("First key"));

        //3, Irassuk ki, hogy üres-e a map
        System.out.print("//3, ");
        System.out.println("Empty? :" + myMap.isEmpty());

        //4, Irassuk ki a konzolra egy bizonyos elemet ha nincs benne a keyekbe (null-t dob vissza, ha nem létezik a key)
        System.out.print("//4, ");
        System.out.println("Get: " + myMap.get("First"));

        //4,b New String test -- 00:17:34 - 00:19:33
//        System.out.println("-------------------------");
//        String a = "First key";
//        String b = new String ("First key"); -- ekkor is fölülírja, hiába más a hashCode, sima stringként ugyanaz
//        hashMap.put(b, 15);
//        System.out.println("Get: " + hashMap.get(a));
//        System.out.println("Get: " + hashMap.get(b));
//        System.out.println("-------------------------");


        //5, Iteráljunk végig rajta és irassuk ki a kulcs-érték párokat. -- ...+ 00:20:20
        System.out.println("-------------------------");
        System.out.println("//5, \n  értékpárok kiírása (entrySet)");
        // myMap.entrySet().iter
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("entrySet: " + entry);
        }

        //6, Iteráljunk végig rajta és írjuk ki  csak a kulcsokat -- 00:21:14
        System.out.println("-------------------------");
        System.out.println("//6, \n  kulcsok kiírása");
        System.out.println(myMap.keySet());
        for (String s : myMap.keySet()) {
            System.out.println("Keys: " + s);
        }

        //7, Iteráljunk végig rajta és írjuk ki  csak a valuekat -- 00:22:24
        System.out.println("-------------------------");
        System.out.println("//7, \n  értékek kiírása");
        System.out.println(myMap.values());
        for (Integer value : myMap.values()) {
            System.out.println("Value: " + value);
        }

        //8, Adjunk hozzá egy elemet, ha még nem szerepel benne. -- 00:26:58
        System.out.println("-------------------------");
        System.out.println("//8, \n  put átírja, putIfAbsent nem a First key-nél");
        System.out.println("Our hasMap: " + myMap);
        myMap.putIfAbsent("First key", 6); // put átírja, putIfAbsent nem
        System.out.println("Our hasMap: " + myMap);
        myMap.put("First key", 6);
        System.out.println("Our hasMap: " + myMap);

        //9, Töröljünk ki egy elemet -- 00:29:25
        System.out.println("-------------------------");
        System.out.println("//9, \n  Törlés csak key-t beadva");
        myMap.remove("First key");
        System.out.println(myMap);

        //10,Töröljünk ki egy elemet, ha értéke egy bizonyos value -- 00:32:34
        System.out.println("-------------------------");
        System.out.println("//10, \n  Törlés értékpárt beadva");
        myMap.remove("Second key", 6);
        System.out.println(myMap);
        myMap.remove("Second key", 2); // csak akkor töröl, ha az értékpár mindkét tagja stimmel
        System.out.println(myMap);

        //11, Töröljük ki a map tartalmát -- 00:33:45
        // hashMap.clear();
        // System.out.println(hashMap);
         System.out.println("-------------------------");
        System.out.println("//11, \n  Map kiürítése clear-rel (lásd a kikommentelt kódot)");

        //12, Lista egy mapben? -- 00:39:37
        System.out.println("-------------------------");
        System.out.println("//12, \n  list-et beadni értékként");
        List<String> strList = new ArrayList<>();
        strList.add("First key");
        strList.add("Second key");
        strList.add("Third key");
        strList.add("Fifth key");
        List<String> strList1 = new ArrayList<>();
        strList1.add("First key");
        strList1.add("Second key");
        strList1.add("Third key");
        strList1.add("Fifth key");
        Map<Integer, List<String>> newHashmap = new HashMap<>();
        newHashmap.put(1, strList);
        newHashmap.put(2, strList1);
        System.out.println(newHashmap);
        for (Map.Entry<Integer, List<String>> integerListEntry : newHashmap.entrySet()) {
            System.out.println("Key: " + integerListEntry.getKey());
            for (String s : integerListEntry.getValue()) {
                System.out.println(s);
            }
        }

        //13, Equals?
        System.out.println("-------------------------");
        System.out.println("Original: " + myMap);
        Map<String, Integer > checkMap = new HashMap<>();
        checkMap.put("Fifth key", 5);
        checkMap.put("Third key", 3);
        System.out.println("Equals? " + myMap.equals(checkMap));

        System.out.println("-----------Sandwiches");
        Map<Integer, Sandwich> sMap = new HashMap<>();
        sMap.put(1, new Sandwich("Ham"));
        sMap.put(2, new Sandwich("Chicken"));
        sMap.put(3, new Sandwich("Beef"));
        sMap.put(4, new Sandwich("Ham"));

        Map<Integer, Sandwich> sMap1 = new HashMap<>();
        sMap1.put(1, new Sandwich("Ham"));
        sMap1.put(2, new Sandwich("Chicken"));
        sMap1.put(3, new Sandwich("Beef"));
        sMap1.put(4, new Sandwich("Ham"));
        System.out.println(sMap.equals(sMap1));
    }
}
