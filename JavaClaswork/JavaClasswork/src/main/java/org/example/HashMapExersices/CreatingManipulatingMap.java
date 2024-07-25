package org.example.HashMapExersices;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreatingManipulatingMap {
    //1.Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args){
        HashMap<Integer, String> zooMap = new HashMap<>();
        zooMap.put(1, "Elephant");
        zooMap.put(2,"Giraffe");
        zooMap.put(3, "Lion");
        zooMap.put(4, "Wolf");

        for(Map.Entry x: zooMap.entrySet()){
            System.out.println(x.getKey()+ " "+x.getValue());
        }

        //2. Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("Number of keys in zooMap is: " + zooMap.size());

        //3. Write a Java program to copy all mappings from the specified map to another map.
        HashMap<Integer, String> newZoo = new HashMap<>();
        newZoo.put(5,"Sheep");
        newZoo.put(6,"Koala");
        newZoo.put(7,"Rino");
        newZoo.put(8,"Hippo");

        newZoo.putAll(zooMap);
        System.out.println("New zoo now contains: " + newZoo);

//       // 4. Write a Java program to remove all mappings from a map.
//        newZoo.clear();
//        System.out.println("Current newZoo after clear: " + newZoo);
//
//       // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("new zoo contains empty values: " +  newZoo.isEmpty());


        //6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> instanceOfNewZoo = new HashMap<>();
        instanceOfNewZoo = (HashMap)newZoo.clone();
        System.out.println("Original newZoo " + newZoo);
        System.out.println("Cloned newZoo " + instanceOfNewZoo);

        //7. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("newZoo map contains key 9: " + newZoo.containsKey(9));

        //8. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("newZoo map contains value Lion: " + newZoo.containsValue("Lion"));

        //9. Write a Java program to create a set view of the mappings contained in a map.
        Set newZooSet = newZoo.entrySet();
        System.out.println("Set values of newZoo: " + newZooSet);

        //10. Write a Java program to get the value of a specified key in a map.
        System.out.println("Value of key 6 is: " + newZoo.get(6));

        //11. Write a Java program to get a set view of the keys contained in this map.
        Set newZooSetKeys = newZoo.keySet();
        System.out.println("Set of keys for newZoo is: " + newZooSetKeys);

        //12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("Collection of values in newZoo map: "+ newZoo.values());



    }
}
