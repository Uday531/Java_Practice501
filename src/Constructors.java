public class Constructors {
    public static void main(String[] args) {
        Human human = new Human("Uday",20,58.00);
        Human human2 = new Human("Uday",20,58.00);
        System.out.println(human.name);
    }
}
class Human{
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        System.out.println("I'm a human");
    }
}