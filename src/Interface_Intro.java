public class Interface_Intro {
    public static void main(String[] args) {
        //interface = like a template can be applied to a class
        //similar to inheritence, but specifies what a class has must do
        //classes can apply more than one interface
        Rabbit r = new Rabbit();
        r.flee();
        Hawk h = new Hawk();
        h.hunt();
        Cat c = new Cat();
        c.flee();
        c.hunt();
        //its like a inheritence but we can specify what a class must do
        //interface objects doesn't have any body and the methods should be mentioned in the interface class
    }
}
class Rabbit implements Prey{

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing!!");
    }
}
class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("Hawk is hunting");
    }
}
class Cat implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("This cat is hunting a rat");
    }

    @Override
    public void flee() {
        System.out.println("Cat is fleeing from a dog");
    }
}
interface Prey{
    void flee();
}
interface Predator{
    void hunt();
}