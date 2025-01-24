import java.util.*;
public class SumTen {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,i=1,sum=0;
        while(i<=5){
            System.out.println("Enter a Number");
            n = s.nextInt();
            sum += n;
            i++;
        }
        System.out.println("Sum of 5 numbers = "+ sum);

    }
}
