package Assignments;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bill = 0;
        List<String> itemsOrdered = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Integer> prices = new ArrayList<>();

        System.out.println("Welcome to Vh-Hotel");
        System.out.println("Menu is ");
        System.out.println("1. Dosa: 30/-");
        System.out.println("2. Masala-Dosa: 45/-");
        System.out.println("3. Idly: 30/-");
        System.out.println("4. Single Poori: 20/-");
        System.out.println("5. Voda: 15/-");
        System.out.println("6. Pongal: 35/-");
        System.out.println("7. Exit");

        while (true) {
            System.out.println("Choose option from 1-7");
            int option = s.nextInt();

            if (option == 7) {
                break;
            }

            int noOfPlates;
            int pricePerPlate = 0;
            String itemName = "";

            switch (option) {
                case 1:
                    itemName = "Dosa";
                    pricePerPlate = 30;
                    break;
                case 2:
                    itemName = "Masala-Dosa";
                    pricePerPlate = 45;
                    break;
                case 3:
                    itemName = "Idly";
                    pricePerPlate = 30;
                    break;
                case 4:
                    itemName = "Single Poori";
                    pricePerPlate = 20;
                    break;
                case 5:
                    itemName = "Voda";
                    pricePerPlate = 15;
                    break;
                case 6:
                    itemName = "Pongal";
                    pricePerPlate = 35;
                    break;
                default:
                    System.out.println("Choose Option from (1-6)");
                    continue;
            }

            System.out.println(itemName + ": " + pricePerPlate + "/-");
            System.out.println("How many Plates?");
            noOfPlates = s.nextInt();
            itemsOrdered.add(itemName);
            quantities.add(noOfPlates);
            prices.add(pricePerPlate);
            bill += noOfPlates * pricePerPlate;
        }

        // Print the order summary
        System.out.println("\nOrdered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(itemsOrdered.get(i) + " x " + quantities.get(i) + " Plates = " + (quantities.get(i) * prices.get(i)) + "/-");
        }

        System.out.println("Total bill: " + bill + "/-");
    }
}
