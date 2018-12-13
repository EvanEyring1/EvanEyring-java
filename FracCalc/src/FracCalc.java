import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class FracCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fInput = input.nextLine();
        System.out.print("Enter three tokens");
        while (!fInput.equals("quit)")) {
            String blah = "";
            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j < fInput.length(); j++) {
                    if (fInput.charAt(j) != ' ') {
                        blah += blah + fInput.charAt(j);
                    } else {
                    }

                }
                System.out.println(blah);
            }
            System.out.print("Input again");
            fInput = input.nextLine();


        }
    }


    }
