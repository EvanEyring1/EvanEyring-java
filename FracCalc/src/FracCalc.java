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
            for (int j = 1; j <= 3; j++) {
                for (int i = 0; i < fInput.length(); i++) {
                    if (fInput.charAt(j) != ' ') {
                        blah += blah + fInput.charAt(j);
                    } else {
                    }
                    while (!fInput.equals("quit")) {
                        String [] terms = new String[3];
                        int x = -1;
                        int m = 0;
                        for (int y = 0; y < fInput.length() ;
                        y++){
                            x++;
                            if (fInput.charAt(y) == ' ') {
                                System.out.println(fInput.substring(y - x, y));
                                terms[m] = fInput.substring(y - x, y);
                                x = -1;
                                m++;
                            }
                            if (m == 2) {
                                System.out.println(fInput.substring(y + 1));
                                terms[m] = fInput.substring(y + 1);
                                m++;
                                //Word count is increasing
                            }
                            System.out.println(blah);
                        }
                        System.out.print("Input again:");
                        fInput = input.nextLine();
                    }
                }
            }

                    }
                }
            }

