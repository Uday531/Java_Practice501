import java.util.Scanner;

public class pythagores {
    public static void main(String[] args){

        double a;
        double b;
        double c;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a value ");
        a = scanner.nextDouble();
        System.out.println("Enter b value ");
        b = scanner.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse is " +c); 

    }
    
}
