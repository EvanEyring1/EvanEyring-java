import java.util.Scanner;
import java.util.Random;
public class rockPaper{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Want to play rock paper scissors? (y/n)");
        String gAnswer = input.next();
        System.out.println("How many rounds do you want?");
        int roundAmount = input.nextInt();
        System.out.print("What is your name fine sir or madam? - ");
        String playerName = input.next();
        while(gAnswer.equals("y")) {
            for(int i = 1; i <= roundAmount; i++){
                System.out.println("Round" + i);
                int personAnswerInt = personStringToInt();
                int computerWeapon = rand.nextInt(3);
                playGame(computerWeapon, personAnswerInt, playerName)
            }
            System.out.println("Wanna play again? (y/n)");
            gAnswer = input.next();
        }
    }
    public static int personStringToInt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pick! : ROCK, PAPER, SCISSORS -");
        String personAnswer = input.next();
        if (weaponAnswer.equals("ROCK")) {
            return 0;
        } else if ()

    }


}

