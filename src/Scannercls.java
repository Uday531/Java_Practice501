import java.util.Scanner;

public class Scannercls {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=s.nextLine();
        System.out.println("Enter your age: ");
        int b=s.nextInt();
        System.out.println("hello there "+a+" "+b);
    }
}
