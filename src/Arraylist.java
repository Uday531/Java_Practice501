import java.util.ArrayList;

public class Arraylist {
    public static void  main(String[] args){

        ArrayList<String> food = new  ArrayList<String>();
        food.add("Pizza");
        food.add("Burger");
        food.add("cake");

        food.set(0, "Noodles");
        food.remove(2);
        // food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
