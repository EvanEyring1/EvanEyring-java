public class DrawBoxes {


    public static void main(String[] args) {



        stars(3, 3, '*');
        stars(3, 3, '?' );
        stars(3, 3, '$');


    }

    public static void stars(int x, int y, char z) {
        for (int i = 0; i <= y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
        System.out.println();
    }
}


