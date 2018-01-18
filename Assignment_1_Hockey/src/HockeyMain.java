import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class HockeyMain {
    //12 player array

    //menu

    /*Hockey Tracker
    A-Add player
    G-Add game details
    S-Show players
    X-Exit*/

    static HockeyPlayer[] players;

    public static void main(String[] args){

        String menuChoice;
        Scanner input = new Scanner(System.in);

        //Create array to index players by number
        players = new HockeyPlayer[12];

        do {
        System.out.print(
            "A- Add player\n" +
            "G- Add game details\n" +
            "S- Show players\n" +
            "X- Exit\n");
            menuChoice = input.next();

            //A Add player
            //create instance use the player number to place them in an array
            if (menuChoice.equalsIgnoreCase("a")) {
                String playerRange = "1-12";
                System.out.print(
                        "Which Player (1-12)? ");
                players[input.nextInt()] = new HockeyPlayer();
            }

            //Add Game Details
            if (menuChoice.equalsIgnoreCase("g")) {
                System.out.print(
                        "Which Player to add Game Details (1-12)? ");
                players[input.nextInt()].addGameDetails();
            }

            //Show players menu
            if (menuChoice.equalsIgnoreCase("s")) {
                for (int i = 0; i < players.length; i++) {
                    System.out.println();
                    System.out.print(players[i]);
                }
            }
        } while (!menuChoice.equalsIgnoreCase("x"));
    }

    //B Add game details
    //prompt player # then call addPlayerDetails method from Hockeyplayer.java

    //S print out the players

    //X quit
}
