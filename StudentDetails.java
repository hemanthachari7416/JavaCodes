import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number");
        int rollNo = sc.nextInt();
        System.out.println("Enter Student Name");
        String name = sc.next();
        System.out.println("Enter marks in three Subjects");
        double mark1 = sc.nextDouble();
        double mark2 = sc.nextDouble();
        double mark3 = sc.nextDouble();
        double total = mark1+mark2+mark3;
        double avg = total/3;
        System.out.println("Roll Number =" + rollNo);
        System.out.println("Stu Name =" + name);
        System.out.println("Total Marks =" + total);
        System.out.println("Average Marks =" + avg);
    }
}
