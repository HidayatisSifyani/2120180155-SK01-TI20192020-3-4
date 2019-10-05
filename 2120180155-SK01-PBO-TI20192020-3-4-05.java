package segitiga5;
public class Segitiga5 {
    public static void main(String[] args) {
        int i, j, k;
        for (i=10; i>=1; i--){
            for (j=10; j>i; j--){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
                System.out.print(5);
            }
            System.out.println();
        }
    }
    
}
