package segitiga4;
public class Segitiga4 {
    public static void main(String[] args) {
        int i, j, k;
        for (i=1; i<=10; i++){
            for (j=10; j>i; j--){
                System.out.print(" ");
            }
            for (k=1; k<(2*i); k++){
                System.out.print("4");
            }
            System.out.println();
        }
    }
    
}
