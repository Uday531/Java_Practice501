public class OOps {
    public static void main(String[] a){
        Car car = new Car();
        Car car2 = new Car();

//        System.out.println(car.color);
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.price);
//        car.drive();
//        car.brake();
        System.out.println(car2.color);
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.price);
        car.drive();
        car.brake();
    }
}
class Car{
    String make="Chevrollete";
    String model="Corvette";
    int year=2022;
    String color="blue";
    double price = 50000.000;

    void drive(){
        System.out.println("You are driving ");
    }
    void brake(){
        System.out.println("You are stopped");
    }
}