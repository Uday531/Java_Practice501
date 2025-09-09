public class TwoDArrays {
    public static void main(String[] args) {
        String name[][]=new String[3][3];
        name[0][0]="Uday";
        name[0][1]="Rajam";
        name[0][2]="Vignesh";
        name[1][0]="ADhi";
        name[1][1]="Mahi";
        name[1][2]="Venky";
        name[2][0]="Nikhil";
        name[2][1]="Ajay";
        name[2][2]="Swamy";
        for(int i=0;i<name.length;i++){
            System.out.println();
            for(int j=0;j<name[0].length;j++){
                System.out.print(name[i][j]+" ");
            }
        }
    }
}
