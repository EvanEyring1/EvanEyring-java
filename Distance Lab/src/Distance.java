/*
Evan Eyring
AP CS A
October 24, 2018
Distance Lab
 */
public class Distance {
    public static void main(String[] args) {
        double d1 = distance(16,10,4,28);
        System.out.println("The distance is " + d1 +" to Gig Harbor from Tacoma");
        // Tacoma --> Gig Harbor
        double d2 = distance(4, 28, 2, 8);
        double s1 =  d2 + d1;
        System.out.println("The distance is " + s1 + " to Steilacoom from Tacoma when you go through Gig Harbor first ");
        //Gig Harbor --> Steilicoom
        double d3 = distance(2, 8, 16, 10);
        double s2 = s1 + d3;
        System.out.println("The distance is " + s2 +" to go round trip");
        //Steilicoom --> Tacoma
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        //Subtracts from inside the parentheses
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        //Has the difference of the coordinates then squares it
        double xy = x4 + y4;
        //Adds the two squared numbers together
        double distance = Math.sqrt(xy);
        //Finds the final sqrt of the two squares added together
        return distance;
    }
}
