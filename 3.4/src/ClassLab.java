public class ClassLab {
    public static void main(String[] args) {
        System.out.println ("Smallest:");
        System.out.println(add(1, 2));
        System.out.println("Largest:");
        System.out.println(least(5, 6, 7));
        System.out.println("Square Root:");
        System.out.println(largest(3,4,5));


    }

    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static double least(double x, double y, double z) {
        double xyz = Math.min(Math.min(x, y), z);
        return xyz;


    }

    public static double largest(double x, double y, double z) {
    double xyz1 = Math.min(Math.min(x, y), z);
    double xyz2 = Math.max(Math.max(x, y), z);
    double xyz3 = xyz1 + xyz2;
    double xyz4 = Math.sqrt(xyz3);
    return xyz4;


}
    }

