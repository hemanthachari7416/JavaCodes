import java.util.Scanner;
public class MajorMinor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Major");}
        else if (age < 0) {
            System.out.println("Invaid Age");
        }
        else{
            System.out.println("Minor");}
    }
}
