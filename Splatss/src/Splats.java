public class Splats {
    public static final int ROW = 6;

    public static void main(String[] args) {
        stars();
        dollar();
        hashtag();

    }

    public static void stars() {
        for (int i = 0; i <= ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void dollar() {
        for (int i = 0; i <= ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void hashtag() {
        for (int i = 0; i <= ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}



