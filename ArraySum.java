import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = s.nextInt();
        int sum = 0;
        int[] n = new int[size];
        System.out.println("Enter"+ size +"values");
            for (int i=0; i<n.length; i++){
                n[i] = s.nextInt();
                sum = sum + n[i];
            }
            System.out.println("Sum of array is "+ sum);
    }
}