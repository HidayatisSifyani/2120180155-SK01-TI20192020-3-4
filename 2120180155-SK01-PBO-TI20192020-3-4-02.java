package segitiga2;
public class Segitiga2 {
    public static void main(String[] args) {
        int i, j, k;
        for (i=1; i<=9; i++){
            for (j=9; j>=i; j--){
                System.out.print(" ");
            }
            for (k=1; k<=i; k++){
                System.out.print("2");
            }
            System.out.println();
        }
    }
    
}
