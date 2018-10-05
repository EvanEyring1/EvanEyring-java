/*---------------------*/
//Evan Eyring
//10/3/18
//AP COMP SCIENCE A
//Lab 2: Rocketship
/*---------------------*/
public class Rocket {
    public static final int SIZE = 14;        /* SIZE is the class constant, if this number changes, so does the rocket's scale */

    public static void main(String[] args) {
        drawCone();
        drawMiddle();
        drawTop();
        drawBot();                          /* Methods are summoned to create the rocket ship */
        drawMiddle();
        drawBot();
        drawTop();
        drawMiddle();
        drawCone();
    }

    public static void drawCone() {                                         /*Method generates the cone through nested for loops */
        for (int line = 1; line <= (SIZE * 2 - 1); line++) {
            System.out.print(" ");
            for (int space = 1; space <= (SIZE * 2 - 1) - line; space++) {
                System.out.print(" ");
            }
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }

    public static void drawMiddle() {                                         /* Method generates the divider through a loop */
        System.out.print("+");
        for (int i = 1; i <= SIZE * 2; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void drawTop() {                                  /*Generates the top part of the rocket through nested and normal for loops */
            for (int line = 1; line <= SIZE; line++) {
                System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                System.out.print(".");
                }
                for (int point = 1; point <= line; point++) {
                    System.out.print("/\\");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

     public static void drawBot() {                             /*Method generates the bottom portion of the rocket through nested and normal for loops*/
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
                for (int point = 1; point <= line; point++) {
                    System.out.print("\\/");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");

        }
    }
}
