import java.util.Scanner;

public class Logicalop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//&& operator1+0=0, || operator1+0=1 and ! operator,1=0
        System.out.println("You are playing a game, Press Q or q to exit!");
        String res=s.next();

        if(res.equals("Q") || res.equals("q")){
            System.out.println("You exit the game");
        }else{
            System.out.println("You are under genjutsu");
        }
    }
}
