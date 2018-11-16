import java.util.Scanner; // Scanner and utility input
import java.util.Random;
public class RockPaperScissors { // Establishes the game, asks if they wanna play, their name, and how many rounds they want to play
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Want to play rock paper scissors? (y/n)");
        String gAnswer = input.next();
        System.out.println("How many rounds do you want?");
        int roundAmount = input.nextInt();
        System.out.print("What is your name fine sir or madam? - ");
        String playerName = input.next();
        while (gAnswer.equals("y")) {
            for (int i = 1; i <= roundAmount; i++) {
                System.out.println("Round" + i);
                int personAnswerInt = personStringToInt();
                int computerWeapon = rand.nextInt(3);
                playGame(computerWeapon, personAnswerInt, playerName);
            }

            System.out.println("Wanna play again? (y/n)"); // ALLOWS USER TO QUIT GAME AFTER YOUR ROUNDS
            gAnswer = input.next();
        }
    } //scans and correlates ROCK, PAPER, and SCISSORS to a number to make coding easier for me, CHOICES ARE CASE SENSITIVE

    public static int personStringToInt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pick one! : ROCK, PAPER, SCISSORS-");
        String rpsAnswer = input.next();
        if (rpsAnswer.equals("ROCK")) {
            return 0;
        } else if (rpsAnswer.equals("PAPER")) {
            return 1;
        } else if (rpsAnswer.equals("SCISSORS")) {
            return 2;
        } else {
            return 3;
        }


        //score 0 = player
        //score 1 = Computer
        //score 2 = ties

    }

    // includes all outcomes that can happen and has a response, the actual gameplay
    public static void playGame(int computerWeapon1, int rpsAnswerInt1, String playerName1) {
        if (computerWeapon1 == rpsAnswerInt1) {
            System.out.println("It's a tie!\n");
        } else if (computerWeapon1 == 0 && rpsAnswerInt1 == 2) {
            System.out.println("Computer chooses ROCK, beating " + playerName1 + "'s SCISSORS\n");
        } else if (computerWeapon1 == 0 && rpsAnswerInt1 == 1) {
            System.out.println("Computer chooses ROCK, losing to " + playerName1 + "'s PAPER\n");
        } else if (computerWeapon1 == 1 && rpsAnswerInt1 == 0) {
            System.out.println("Computer chooses PAPER, beating " + playerName1 + "'s ROCK\n");
        } else if (computerWeapon1 == 1 && rpsAnswerInt1 == 2) {
            System.out.println("Computer chooses PAPER, losing to " + playerName1 + "'s SCISSORS\n");
        } else if (computerWeapon1 == 2 && rpsAnswerInt1 == 1) {
            System.out.println("Computer chooses SCISSORS, beating " + playerName1 + "'s PAPER\n");
        } else if (computerWeapon1 == 2 && rpsAnswerInt1 == 0) {
            System.out.println("Computer chooses SCISSORS, losing to " + playerName1 + "'s ROCK\n");
        } else if (rpsAnswerInt1 == 3) {
            System.out.println("Please choose, ROCK, PAPER, or SCISSORS");
        } else if (rpsAnswerInt1 == 4) {
            System.out.println("Thanks for playing!");



        }

    }
}
