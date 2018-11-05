public class Quadrent {
    public static void main(String[] args) {
        double x = -5;
        ;
        double y = 5;
        System.out.println("Coords in quadrant " + getQuad(x, y));
    }
    public static int getQuad(double x, double y){
        if(x < 0 && y > 0) {
            return 2;
        }
        else if(x < 0 && y < 0){
            return 3;
        }
        else if(x > 0 && y < 0){
            return 4;
        }
        else if(x > 0 && y > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
