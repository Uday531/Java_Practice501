public class Overloadedmethods {
    public static void main(String[] args) {
        int x=A(1);
        System.out.println(x);
    }
    static int A(int a){
        return a;
    }
    static int A(int a,int b){
        return a+b;
    }
}
