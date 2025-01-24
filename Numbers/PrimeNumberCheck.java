package Numbers;

import java.util.*;
public class PrimeNumberCheck {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1,count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        System.out.println(count==2?"Prime Number:- " +n:"Not a PrimeNumber:- " +n);
    }
}
