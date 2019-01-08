import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class FracCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three tokens: ");
        String fInput = input.nextLine();
        while (!fInput.equals("quit")) {
            String [] nums = new String[3];
            int x = -1;
            int m = 0;
            for (int y = 0; y < fInput.length(); y++) {
                x++;
                if (fInput.charAt(y) == ' ') {
                    System.out.println(fInput.substring(y - x, y));
                    nums[m] = fInput.substring(y - x, y);
                    x = -1;
                    m++;
                }
                if (m == 2) {
                    System.out.println(fInput.substring(y + 1));
                    nums[m] = fInput.substring(y + 1);
                    m++;
                    //Word count is increasing
                }
            }

                 System.out.print("Input again:");
                 fInput = input.nextLine();
                    }
                }
            }





