import java.util.Scanner;
public class MTable{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:--");
            while(true){
                int n = s.nextInt();// 2
                if (n==0){
                    System.out.println("Invalid Number");
                    break;
                }
                for (int i=1; i<=10; i++) {
                int p = n * i;
                System.out.println(n + " * " + i + " = " + p);
            }
        }
    }
}