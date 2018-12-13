/*
 * **********************************
 * Evan Eyring
 *
 * AP CS A
 *
 * Period 1
 *
 * December 6, 2018
 *
 * Rollling Dice Project (Chapter 7)
 *
 * *********************************
 * */
import java.util.*;
@SuppressWarnings("ALL")
public class dice {
    //Class constant defines amount of dice being rolled
    public static int DICENUM = 1;
    public static void main(String[] args) {
        //Tallys amount of rounds played
        int rollCount = 0;
        //Constructs the scanner within the main method
        Scanner userInput = new Scanner(System.in);
        String[][] setDice = defineDice();
        System.out.print("Would you like to roll the dice? (y/n) -- ");
        String gameState = userInput.next();
        while (gameState.equals("y")){
            String[][] diceSet = new String[DICENUM][DICENUM];
            drawLine();
            for(int i = 1; i <= DICENUM; i++){
                //Assigns value to a roll
                int roll = (int) Math.round(Math.random() * 5);
                diceSet[i - 1] = setDice[roll];
            }
            //Takes the dice from the previous loop and prints it
            printDice(diceSet);
            drawLine();
            //Adds 1 to the count
            rollCount++;
            //Gives a replay option to the player
            System.out.print("Wanna play again? (y/n) -- ");
            //Lets the player leave or replay
            gameState = userInput.next();
        }
        System.out.println("The dice has been rolled " + rollCount + " times.");
    }
    public static String[][] defineDice(){
        //Establishes strings to represent dice parts
        String topBot =     " ------- ";
        String walls =      "|       |";
        String middleOne =  "|   *   |";
        String middleTwo =  "| *   * |";
        String leftOne =    "| *     |";
        String rightOne =   "|     * |";
        //Creates arrays for each dice option
        String[] One = {topBot, walls, middleOne, walls, topBot};
        String[] Two = {topBot, walls, middleTwo, walls, topBot};
        String[] Three = {topBot, leftOne, middleOne, rightOne, topBot};
        String[] Four = {topBot, middleTwo, walls, middleTwo, topBot};
        String[] Five = {topBot, middleTwo, middleOne, middleTwo, topBot};
        String[] Six = {topBot, middleTwo, middleTwo, middleTwo, topBot};
        return new String[][]{One, Two, Three, Four, Five, Six};
    }
    public static void printDice(String[][] x){
        //Traversal
        for(int y = 0; y < x[0].length; y++){
            //Traversal for the sides of the dice
            for (String[] z : x)
                System.out.print(z[y] + "\t");
            //Moves cursor down (quality of life)
            System.out.println();
        }
    }
    public static void drawLine(){
        for(int i = 0; i < 14 * DICENUM; i++)
            System.out.print("-");
        //Moves cursor again
        System.out.println();
    }
}


