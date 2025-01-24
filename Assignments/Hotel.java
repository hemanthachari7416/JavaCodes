package Assignments;
import java.util.*;
public class Hotel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bill = 0;
        System.out.println("Welcome to Vh-Hotel");

        while (true)
        {
        System.out.println("Menu is ");
        System.out.println("1. Dosa: 30/-");
        System.out.println("2. Masala-Dosa: 45/-");
        System.out.println("3. idly: 30/-");
        System.out.println("4. Single Poori: 20/-");
        System.out.println("5. Voda: 15/-");
        System.out.println("6. Pongal: 35/-");
        System.out.println("7. Exit");
        System.out.println("Choose option from 1-7");

        int option = s.nextInt();
            if (option == 7) {
                break;
            }
            int noOfPlates;
            int items;
            switch (option) {
                case 1:
                    System.out.println("Dosa: 30/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill += noOfPlates * 30;
                    break;
                case 2:
                    System.out.println("Masala-Dosa: 45/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill += noOfPlates * 45;
                    break;
                case 3:
                    System.out.println("idly: 30/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill += noOfPlates * 30;
                    break;
                case 4:
                    System.out.println("Single Poori: 20/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill += noOfPlates * 20;
                    break;
                case 5:
                    System.out.println("Voda: 15/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill = noOfPlates * 15;
                    break;
                case 6:
                    System.out.println("Pongal: 35/-");
                    System.out.println("How many Plates?");
                    noOfPlates = s.nextInt();
                    bill = noOfPlates * 35;
                    break;
                default:
                    System.out.println("Choose Option from (1-6)");
            }
        }
        System.out.println("Total bill: " +bill+ "/-");
    }
}