public class MethodOverriding {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
    }
}
class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
}
class  Dog extends Animal{
    void speak(){
        System.out.println("Dog barks");
    }
}
