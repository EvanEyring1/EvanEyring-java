import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class dice {
    public static final int DICENUM = 1;

    public static void main(String[] args) {
        String playAgain ="y";
        defineDice();
        while (playAgain.equals("y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Roll the Dice");
            rollDice();
            printDice();
            drawLine();
            System.out.println("Wanna play again y/n");
            playAgain = input.next();



        }
    }

    public static void defineDice() {
        System.out.println("Define Dice");


    }

    public static void rollDice() {
        System.out.println("Roll Dice");


    }


    public static void printDice(){
        System.out.println("Print Dice");
    }

    public static void drawLine(){
        System.out.println("Draw Line");
    }
}



