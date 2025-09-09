public class Arayofobjects {
    public static void main(String[] args) {
        Food[] f= new Food[3];

        Food f1=new Food("Pizza");
        Food f2 = new Food("hamburger");
        Food f3=new Food("hotdog");

        f[0]=f1;
        f[1]=f2;
        f[2]=f3;
        System.out.println(f[1].name);
        System.out.println(f[0].name);
        System.out.println(f[2].name);
    }
}
class Food{
    String name;
    Food(String name){
        this.name=name;
    }
}