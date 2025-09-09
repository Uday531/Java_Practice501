import java.util.Scanner;

//class A{
//String hello(String name){
//    System.out.println("Hello "+name);
//    return name;
//}
//}
//
//public class Method {
//    public static void main(String[] args) {
//        A a = new A();
//        Scanner s = new Scanner(System.in);
//        a.hello(s.nextLine());
//    }
//}
public class Method {
    public static void main(String[] args) {
        int z;
        int x=3;
        int y=4;
        z=add(x,y);
        System.out.println(z);
    }
    static int add(int a,int b){
        int z=a+b;
        return z;
    }
}