package org.example.SBA2_2;

import java.text.DecimalFormat;

public class Cricket implements Sport {
    //creating the variable int playersIDs
 private int[] playerIDs;

 //Method cricket
 public Cricket(){

     playerIDs = new int[12];// initialize the method to store 11 integer values (remember that this is 1 base array)

     for(int pos = 1; pos< playerIDs.length; pos++){
         playerIDs[pos] = 1;
     }
     System.out.println("A new cricket team has been formed");
 }

 // void calculate AvgAge
    @Override
    public void calculateAvgAge(int[] age) {
     double sum = 0;
     for (int a : age){
         sum = sum + a;
     }
     double average = sum / age.length;
        DecimalFormat df = new DecimalFormat("0.00");
        // Print the average age with two digits after the decimal
        System.out.println( "The average age of the team is " + df.format(average));
    }

// void retirePlayer
    @Override
    public void retirePlayer(int id) {
        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }

    }

        public static void main(String[] args) {
            // Create a new Cricket team
            Cricket cricketTeam = new Cricket();

            // Array of ages for the players
            int[] ages = {25, 28, 30, 27, 24, 29, 31, 26, 23, 28, 30};

            // Calculate and display the average age of the team
            cricketTeam.calculateAvgAge(ages);

            // Retire a player with ID 3
            cricketTeam.retirePlayer(3);

            // Attempt to retire the same player again
            cricketTeam.retirePlayer(3);

            // Retire a player with ID 5
            cricketTeam.retirePlayer(5);
        }
    }
