public class Polymorphishm_Intro {
    public static void main(String[] args) {
        //polymorphism = poly means many and morph means forms
        // polymorphism is an ability to identify the objects as more than one type
        car c = new car();
        plane p = new plane();
        boat b = new boat();

        Vehicle[] racers = {c,p,b};//many objects can be stored in its parent class object
        for (Vehicle x : racers){
            x.go();
        }
    }
}
class Vehicle{
    public void go(){

    }
}
class car extends Vehicle{
    public void go(){
        System.out.println("The car is moving");
    }
}
class plane extends Vehicle{
    public void go(){
        System.out.println("The plane is moving");
    }
}
class boat extends Vehicle{
    public void go(){
        System.out.println("The boat is moving");
    }
}