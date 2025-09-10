public class CopyObjects {
    public static void main(String[] args) {
        Carr1 c1 = new Carr1("Chevrollete","Camero",2020);
        Carr1 c2 = new Carr1("Ford","Mustang",2022);
        //we can copy car1 attributes to car2 by creating a seperate copy method
        //this is used to copy objects without changing their respective addresses
        c2.copy(c1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.getmake());
        System.out.println(c1.getmodel());
        System.out.println(c1.getyear());
    }
}
class Carr1{
    private String make;
    private String model;
    private int year;
    Carr1(String make,String model,int year){
        this.setmake(make);
        this.setmodel(model);
        this.setYear(year);
    }
    //getter methods
    public String getmake(){
        return make;
    }
    public String getmodel(){
        return model;

    }
    public int getyear(){
        return year;
    }
    //setter methods
    public void setmake(String make){
        this.make=make;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void copy(Carr1 x){
        this.setmake(x.getmake());
        this.setmodel(x.getmodel());
        this.setYear(x.getyear());
    }
}
