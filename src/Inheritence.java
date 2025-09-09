public class Inheritence {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.birth();
        c.hi();
        c.mew();
    }
}
class Parent{
    void hi(){
        System.out.println("Parent says hi");
    }
    void birth(){
        System.out.println("the give birth");
    }
}
class Child1 extends Parent{
    void mew(){
        System.out.println("You are a child");
    }
}
