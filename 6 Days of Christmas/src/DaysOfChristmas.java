/*
**************************************************
* Evan Eyring
* AP CS A
* Period 1
* September 10 2018
* Project #1 - SixDays of Xmas
* ************************************************
 */

public class DaysOfChristmas {
    public static void main(String[] args) {

        Day1();
        Day2();
        Day3();
        Day4();
        Day5();
        Day6();

    }

    public static void Day1() { /* Day 1 Method */
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        partridge();

    }
    public static void partridge() { /* Partridge Method */
        System.out.println("a partridge in a pear tree.");
        System.out.println();
    }



    public static void Day2() {  /* Day 2 Method */
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        turtleDoves();

    }

    public static void turtleDoves() { /* Turtle Doves Method */
        System.out.println("two turtle doves, and");
        partridge();
    }

    public static void Day3() { /* Day 3 Method */
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        frenchHens();

    }

    public static void frenchHens() { /* French Hens Method */
        System.out.println("three french hens,");
        turtleDoves();

    }

    public static void Day4() { /* Day 4 Method */
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        callingBirds();

    }

    public static void callingBirds() { /* Calling Birds Method */
        System.out.println("four calling birds,");
        frenchHens();

    }

    public static void Day5() { /* Day 5 Method */
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        goldenRings();

    }

    public static void goldenRings() { /* Golden Rings Method */
        System.out.println("five golden rings,");
        callingBirds();


    }

    public static void Day6() { /* Day 6 Method */
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        geeseLaying();

    }

    public static void geeseLaying() { /* Goose method */
        System.out.println("six geese a-laying,");
        goldenRings();
    }

}
