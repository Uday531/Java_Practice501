import java.util.Random;

public class Variablescope {
    public static void main(String[] args) {
        // local >- inside a method  and global -> outside a method variables
        DiceRoller diceroller = new DiceRoller();
    }
}
class DiceRoller{
    Random random = new Random();
    int number = 0;//global
    DiceRoller(){
    roll(random,number);
}
void roll(Random random,int number){
        number=random.nextInt(6);
        System.out.println(number);
}
}
