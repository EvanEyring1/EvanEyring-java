import java.util.*;
public class ArrayWorksheet {
    //1a)
    public static void main(String[] args) {
        int[] numbersArray1 = new int[8];
        //2a
        numbersArray1[0] = 10;
        numbersArray1[1] = 9;
        numbersArray1[2] = 8;
        numbersArray1[3] = 7;
        numbersArray1[4] = 6;
        numbersArray1[5] = 5;
        numbersArray1[6] = 4;
        numbersArray1[7] = 3;
        //2b
        for (int i = 0; i < 8; i++) {
            numbersArray1[i] = i * 3;
        }
        //2c
        int[] numbersArray2 = new int[5];
        for (int i = 0; i < 5; i++) {
            numbersArray2[i] = i * 2;
            System.out.println(numbersArray2[i]);

        }

    }
}