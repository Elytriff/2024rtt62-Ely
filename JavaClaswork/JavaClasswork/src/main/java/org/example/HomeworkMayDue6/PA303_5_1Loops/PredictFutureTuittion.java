package org.example.HomeworkMayDue6.PA303_4_1ControlFlow.PA303_5_1Loops;

public class PredictFutureTuittion {
    public static void main(String[] Args) {
        //Predict Future Tuition
        //Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year
        // In how many years will the tuition be doubled?

        int currentTuition = 10000;
        float percentage = currentTuition * (7f / 100);
        int counter = 0;
        //System.out.println(percentage);
        System.out.println("This year tuition is: " + currentTuition);
        float x = currentTuition + percentage;// initializing first count to start at 10700
        while (x <= currentTuition * 2) {
            System.out.println("Next year tuition is: " + (int)x);
            x = x + percentage;
            counter ++;
        }
        System.out.println("Tuition will double in: " + (counter) + " years.");
    }
}
