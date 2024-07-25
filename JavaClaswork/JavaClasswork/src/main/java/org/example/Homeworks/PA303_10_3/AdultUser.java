package org.example.Homeworks.PA303_10_3;

public class AdultUser implements LibraryUser{

    int age;
    String bookType;

    public AdultUser(int age, String bookType){
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
