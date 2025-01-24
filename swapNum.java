import java.util.*;
public class swapNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b values: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Before Swapping value of a is " +a+ " and value of b is " +b);
        a = (a+b) - (b=a);
        System.out.println("After swapping value of a is " +a+ " and value of b is " +b);
    }
}
