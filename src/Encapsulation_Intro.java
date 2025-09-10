public class Encapsulation_Intro {
    public static void main(String[] args) {
        //Encapsulation: attributes of a class wil be hidden or private
        //it adds a layer of security
        //we use getter methods and setter methods to access the attributes which are in car class object but are declared as private

        Carrr c = new Carrr("Chevrollete","camero",2023);
        System.out.println(c.getmake());
        c.setYear(2022);
        //we use getter methods to retrieve the info that is made through the object creation and set as private
        //where setter methods are used for setting any new values to the attributes
        System.out.println(c.getyear());
        System.out.println(c.getmodel());
    }
}
class Carrr{
    private String make;
    private String model;
    private int year;
    Carrr(String make,String model,int year){
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
}
