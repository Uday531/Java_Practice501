public class Statickeyword {
    public static void main(String[] args) {
        Friend f1= new Friend("Uday");
        System.out.println(Friend.nooffriends);
        System.out.println(f1.name);
    }
}
class Friend{
    String name;
    static int nooffriends;

    Friend(String name){
        this.name=name;
        nooffriends++;
    }
}