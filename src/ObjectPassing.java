public class ObjectPassing {
    public static void main(String[] args) {
        Garage g = new Garage();
        Carr c = new Carr("Chevrolltte");
        g.park(c);
    }
}
class Garage{
    void park(Carr car){
        System.out.println("Car is parked~~"+car.name);
    }
}
class Carr{
    String name;
    Carr(String name){
        this.name=name;
    }
}
