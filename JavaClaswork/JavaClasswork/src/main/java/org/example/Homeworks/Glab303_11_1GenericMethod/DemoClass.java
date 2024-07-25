package org.example.Homeworks.Glab303_11_1GenericMethod;

public class DemoClass {// create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

}
