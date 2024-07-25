package org.example.SBA2;

import java.util.ArrayList;

public class ArrayToList {
    private ArrayList<String> arrayToList = new ArrayList<>();

    //Initializes an empty list array to list
    public ArrayToList() {
        arrayToList = new ArrayList<>();
    }

    //Void convert (String[] a)
    public void convert(String[] a){
        //use a for loop, old style, to pass string into the arrayList

        for (int pos = 0; pos < a.length; pos++) {
            arrayToList.add(a[pos]);
            System.out.println("I have added the string: " + a[pos] + " at the index" + pos);
        }
    }

    //void replace (int idx)
    public void replace (int idx){

        String value = arrayToList.get(idx);

        arrayToList.set(idx, ""); // arrayToList.set(idx, null);

        System.out.println("I have replaced the string: " + value + " with null string");
    }

    //ArrayList<String>compact()
    public ArrayList<String> compact(){
        ArrayList<String> result = new ArrayList<>();
        for(String s: arrayToList){
            if(!s.isEmpty()){ //  if(! s.equals("")){
                result.add(s);
            }
        }

         return result;

    }

    //_______________________________________________________________________
    // Trying the methods
    public static void main(String[] args) {
      // Create an instance of ArrayToList
        ArrayToList atl = new ArrayToList();

        // Convert an array of strings to an ArrayList
        String[] array = {"apple", "banana", "cherry", "date"};
        atl.convert(array);

        // Replace an element at index 1
        atl.replace(1);

        // Compact the list to remove empty strings
        ArrayList<String> compactedList = atl.compact();

        // Print the compacted list
        System.out.println("Compacted List: " + compactedList);
    }

}
