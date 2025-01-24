import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length value");
        int len = sc.nextInt();
        System.out.println("Enter Breadth Value");
        int bred = sc.nextInt();
        int area = len*bred;
        System.out.println("Area of Rectangle "+ area);
    }
}
