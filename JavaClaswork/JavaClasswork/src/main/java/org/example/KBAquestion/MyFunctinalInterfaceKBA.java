package org.example.KBAquestion;
@FunctionalInterface
public interface MyFunctinalInterfaceKBA {
    public Integer sqr(int a);

    default String sqr(String a) {
        return a + a;
    }

}
