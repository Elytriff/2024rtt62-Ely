package org.example.Homeworks.PA303_10_1;

public class FireMonster extends Monster{
    public FireMonster(String r2u2) {
        super(r2u2);
    }

    @Override
    public String attack() {
        super.attack();
        return super.attack() + "fire!";
    }
}
