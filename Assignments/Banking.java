package Assignments;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int balance = 50000;
        int withdraw, deposit;
        password p = new password();
        reset r = new reset();

        while (true) {
            System.out.println("\nWELCOME TO BANK OF ABROAD");
            System.out.println("YOUR ACCOUNT NUMBER IS 3142**");
            System.out.println("CHOOSE 1: WITHDRAW");
            System.out.println("CHOOSE 2: DEPOSIT");
            System.out.println("CHOOSE 3: CHECK BALANCE");
            System.out.println("CHOOSE 4: CHANGE PIN");
            System.out.println("CHOOSE 5: EXIT");
            System.out.print("CHOOSE THE OPTION YOU WANT TO PERFORM: ");
            int op = s.nextInt();

            switch (op) {
                case 1:
                    p.pin(s);
                    System.out.print("ENTER YOUR WITHDRAWAL AMOUNT: ");
                    withdraw = s.nextInt();
                    if (withdraw > 0 && balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("PLEASE COLLECT YOUR MONEY.");
                    } else {
                        System.out.println("INSUFFICIENT FUNDS OR INVALID AMOUNT.");
                    }
                    balance = addBonus(balance);
                    System.out.println("UPDATED BALANCE: " + balance);
                    break;

                case 2:
                    p.pin(s);
                    System.out.print("ENTER YOUR DEPOSIT AMOUNT: ");
                    deposit = s.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("YOUR AMOUNT HAS BEEN SUCCESSFULLY DEPOSITED.");
                    } else {
                        System.out.println("INVALID DEPOSIT AMOUNT.");
                    }
                    balance = addBonus(balance);
                    System.out.println("UPDATED BALANCE: " + balance);
                    break;

                case 3:
                    p.pin(s);
                    System.out.println("YOUR CURRENT BALANCE IS: " + balance);
                    balance = addBonus(balance);
                    break;

                case 4:
                    System.out.print("ENTER YOUR CURRENT PIN TO CHANGE IT: ");
                    p.pin(s);
                    System.out.print("ENTER YOUR NEW PIN: ");
                    r.setNewPin(s.nextInt());
                    System.out.println("PIN CHANGED SUCCESSFULLY.");
                    break;

                case 5:
                    System.out.println("THANK YOU FOR USING OUR SERVICE.");
                    s.close();
                    System.exit(0);

                default:
                    System.out.println("INVALID OPTION! PLEASE CHOOSE A VALID OPTION.");
            }
        }
    }

    // Method to add bonus based on balance conditions
    private static int addBonus(int balance) {
        if (balance > 50000) balance += 50;
        if (balance > 100000) balance += 50;
        return balance;
    }
}

// Password verification class
class password {
    void pin(Scanner s) {
        System.out.print("ENTER YOUR PIN NUMBER: ");
        int n = s.nextInt();
        reset r = new reset();
        if (n == r.getPin()) {
            return;
        } else {
            System.out.println("INCORRECT PIN NUMBER. ACCESS DENIED!");
            System.exit(0);
        }
    }
}

// Reset PIN class
class reset {
    private static int pin = 1001;

    public int getPin() {
        return pin;
    }

    public void setNewPin(int newPin) {
        pin = newPin;
    }
}
