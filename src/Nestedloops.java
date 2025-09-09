import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int rows=s.nextInt();
        System.out.println("Enter no of cols");
        int cols=s.nextInt();
        System.out.println("Enter the symbol: ");
        String symbol=s.next();
        for (int i=1;i<=rows;i++){
            System.out.println();
            for (int j=1;j<=cols;j++){
                System.out.print(symbol);
            }
        }
    }
}
