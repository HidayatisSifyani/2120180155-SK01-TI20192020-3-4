package segitiga6;
public class Segitiga6 {
    public static void main(String[] args) {
        int i, j, k, l;
        int x=10;
        for (i=1; i<=9; i++){
            for (j=9; j>=i; j--){
                System.out.print(" ");
            }
            for (k=1; k<=i; k++){
                System.out.print("6");
            }
            for (l=1; l<=i-1; l++){
                System.out.print("6");
            }
            System.out.println();
        }
        for (i=1; i<=10; i++){
            for (j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (l=10; l>=i; l--){
                System.out.print("6");
            }
            for (k=9; k>=i; k--){
                System.out.print("6");
            }
            System.out.println("");
        }
    }
    
}
