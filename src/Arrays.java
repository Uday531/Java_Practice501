public class Arrays {
    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5};
//        String[] car={"Audi","Fortuner","BMW"};
//        car[1]="Porsche";
//        System.out.println(car[1]);
//    }
        String cars[]=new String[3];
        cars[0]="Porsche";
        cars[1]="BMW";
        cars[2]="Tesla";
        for(int i=0;i< cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
