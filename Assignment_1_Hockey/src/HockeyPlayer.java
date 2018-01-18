import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.internal.util.xml.impl.Input;

import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class HockeyPlayer {

    public String pName;
    public int pNumber;
    public int[] gameNum = new int[10];
    public int[] score = new int[10];
    public String[] opponentTeam = new String[10];

    Scanner input = new Scanner(System.in);

    /*addGameDetails method which returns void.
    This method should prompt for the game number,
     opponent name, and number of goals scored by the player.*/

    public HockeyPlayer(){
        //HockeyPlayer default constructor sets name
        // , number, and initializes the array with -1.
        System.out.print("Player Name ");
        setpName(input.nextLine());
        System.out.print("Player Number ");
        setpNumber(input.nextInt());
    }

    public void addGameDetails(){
        System.out.print("Game Number #");
        int i = input.nextInt();
        gameNum[i] = i;
        //setGameNum();
        System.out.print("Enter Opponent Name: ");
        input.nextLine();
        opponentTeam[i] = input.nextLine();
        System.out.print("# of Goals Scored ");
        score[i] = (input.nextInt());
    }

    //toString

/*    Player details

    #9 Will MacLean

    Game details:

    Game 1:  Morell 2 goals

    Game 3:  Souris 0 goals

    Game 4:  Montague  4 goal

    Total games:  3

    Total goals:  6*/
    public String toString(){
        String output = "#"
            + getpNumber() + " "
            + getpName() + " \n\n"
            + "Game details: \n\n";

        for(int i = gameNum.length;i > gameNum.length; i++){
            output += "Game " + i
                    + ": " + opponentTeam[i]
                    + " " + score[i]
                    + " goals \n\n";
        }
        return output;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

}
