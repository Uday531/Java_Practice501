import java.util.Scanner;

public class Dyna_Polymorphism {
    public static void main(String[] args) {
        // many forms
        //dynamic = after compilation(During runtime)
        //its the ability to take many forms during runtime
        Scanner s = new Scanner(System.in);
        Animal1 a ;

        System.out.println("What animal do you want?");
        System.out.println("Dog or cat");
        int choice = s.nextInt();
        if(choice == 1){
            a=new Dog1();
            a.speak();
        } else if (choice==2) {
            a=new cat1();
            a.speak();
        }
        else{
            a=new Animal1();
            System.out.println("That choice was invalid");
        }
    }
}
class Animal1{
    void speak(){

    }
}
class Dog1 extends Animal1{
    public void speak(){
        System.out.println("Dog barks");
    }
}
class cat1 extends Animal1{
    public void speak(){
        System.out.println("Cat meows");
    }
}
