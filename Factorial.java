import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = s.nextInt();
        int f = 1;
        int i;
        for (i = n; i >= 1; i--)
            f *= i;
        System.out.println("Factorial of the given number " + n + " is:  " + f);
        for (int j = n; j >= 1; j--) {
            if (j == 1) {
                System.out.print(j);
            } else {
                System.out.print(j + " * ");
            }


        }
    }
}
