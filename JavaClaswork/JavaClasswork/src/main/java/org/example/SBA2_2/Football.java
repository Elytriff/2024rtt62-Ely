package org.example.SBA2_2;

import java.text.DecimalFormat;

public class Football implements Sport {
    private int[] playerIDs;

    public Football() {
        playerIDs = new int[12];
        for (int pos = 1; pos < playerIDs.length; pos++) {
            playerIDs[pos] = 1;
        }
        System.out.println("A new football team has been formed");
    }

        @Override
        public void calculateAvgAge ( int[] age){
            double sum = 0;
            for (int a : age) {
                sum = sum + a;
            }
            double average = sum / age.length;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("The average age of the team is " + df.format(average));
        }

        @Override
        public void retirePlayer ( int id){
            if (playerIDs[id] == -1) {
                System.out.println("Player has already retired");
            } else {
                playerIDs[id] = -1;
                System.out.println("Player with id " + id + " has retired");
            }

        }
        public void playerTransfer ( int fee, int id){
            if (playerIDs[id] == -1) {
                System.out.println("Player has already retired");
            } else {
                System.out.println(" Player with id " + id  + "has been transferred with a fee of " + fee);
            }
        }

        //__________________________________________
    //testing the code

    public static void main(String[] args) {
        // Create a new Football team
        Football footballTeam = new Football();

        // Array of ages for the players
        int[] ages = {22, 25, 27, 30, 28, 24, 29, 26, 23, 31, 32};

        // Calculate and display the average age of the team
        footballTeam.calculateAvgAge(ages);

        // Retire a player with ID 4
        footballTeam.retirePlayer(4);

        // Attempt to retire the same player again
        footballTeam.retirePlayer(4);

        // Transfer a player with ID 6
        footballTeam.playerTransfer(5000000, 6);

        // Attempt to transfer a retired player
        footballTeam.playerTransfer(7000000, 4);
    }

}
