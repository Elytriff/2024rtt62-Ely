package org.example.Homeworks.PA303_10_1;

public class StoneMonster extends Monster{
    public StoneMonster(String r2r2) {
        super(r2r2);
    }

    @Override
    public String attack() {
        super.attack();
        return super.attack() + "stone!";
    }
}
