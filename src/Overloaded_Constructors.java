public class Overloaded_Constructors {
    public static void main(String[] args) {
        Pizza p = new Pizza("Thicc Crust","tomato","Mozerella");

        System.out.println("The ingredients ");
        System.out.println(p.bread);
        System.out.println(p.sauce);
        System.out.println(p.cheese);
        System.out.println(p.toppings);
        System.out.println(p);
    }
}
class Pizza{
    String bread;
    String sauce;
    String cheese;
    String toppings;
    Pizza(String bread,String sauce,String cheese,String toppings){
        this.bread=bread;
        this.cheese=cheese;
        this.sauce=sauce;
        this.cheese=cheese;
    }
    Pizza(String bread,String sauce,String cheese){
        this.bread=bread;
        this.cheese=cheese;
        this.sauce=sauce;
    }
    Pizza(String bread,String sauce){
        this.bread=bread;
        this.sauce=sauce;
    }
    Pizza(String bread){
        this.bread=bread;
    }
}