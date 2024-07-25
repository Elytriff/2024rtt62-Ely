package org.example.Homeworks.PA303_10_3;

public class KidUser implements LibraryUser{
    int age;
    String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {

    }

    @Override
    public void requestBook() {

    }
}
