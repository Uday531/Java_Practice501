import java.util.Scanner;

public class Mathclass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle: ");
        double x=s.nextDouble();
        System.out.println("Enter the 2st side of triangle: ");
        double y=s.nextDouble();
        double z=Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is: "+z);

    }
}
