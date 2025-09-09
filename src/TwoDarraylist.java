import java.util.ArrayList;
import java.util.*;

public class TwoDarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> food = new ArrayList();

        ArrayList<String> bakery = new  ArrayList<String>();
        bakery.add("Pizza");
        bakery.add("Burger");
        bakery.add("Donuts");

        ArrayList<String> produce = new  ArrayList<String>();
        produce.add("tomatoes");
        produce.add("potatoes");
        produce.add("Grapes");

        ArrayList<String> drinks = new  ArrayList<String>();
        drinks.add("Soda");
        drinks.add("pepsi");

        food.add(bakery);
        food.add(produce);
        food.add(drinks);
        System.out.println(food.get(1));
    }
}
