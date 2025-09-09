import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name="";
        while(name.isBlank()){
            System.out.println("Enter  you name: ");
            name=s.nextLine();
        }
        System.out.println(name);
    }
}
