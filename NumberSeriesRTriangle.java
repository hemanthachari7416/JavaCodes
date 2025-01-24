
import java.util.Scanner;

class NumberSeriesRTriangle {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int n = h.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }      
            System.out.println();
            
        }
    }
}