public class FibonacciSeries {
    public static void main(String[] args){
        int n=20, a = 0, b = 1;
        for(int i=2;i<=n;i++){
            int c = a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }
    }
}
