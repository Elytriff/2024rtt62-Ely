package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachLambdaExample {
    public static void main (String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Larry");
        names.add ("Steve") ;
        names.add ("James") ;
        names.add ( "Conan") ;
        names.add ( "Ellen") ;

        // this does the same as an old style for each
        names.forEach (name -> {  System.out.println (name);    } );

        // Removes names starting with E
        names = names.stream().filter(name -> !name.startsWith("E")).collect(Collectors.toList());

        for(String name : names){
        }
        System.out.println(names);

        long count = names.stream().filter(name -> name.startsWith("J")).count();
        System.out.println("Names in list starting with J");


    }


}
