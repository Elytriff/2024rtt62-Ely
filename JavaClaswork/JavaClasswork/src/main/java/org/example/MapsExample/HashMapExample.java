package org.example.MapsExample;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){

        Map<String,String> stringMap =new HashMap<>();
        stringMap.put("key1", "Value1");
        stringMap.put("key2", "Value2");
        stringMap.put(null, "actual value");
        stringMap.put("Null value1", null);// Several values can be declared "nul
        stringMap.put("null value2", null);

        //Maps can only have one "null" in the keys
        stringMap.put(null, "actual value1234");

        //reassigning value
        stringMap.put("key1", "value1234");

        for (String key1: stringMap.keySet()){
            System.out.println(key1 + "==" + stringMap.get(key1));
        }

        Map<String,List<String>> listMap= new HashMap<>();// The value here is a whole List array.

    }
}
