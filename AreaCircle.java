import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of the Circle is " + area);
    }
}
