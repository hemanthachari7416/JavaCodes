import java.util.*;
public class EvenNumSeries {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int i =1;
        while(i<=100){
            if (i%2==0) System.out.print(i + " ");
            i++;
        }
    }
}
