import java.util.*;
class BankTest {
    int AccNum;
    String AccName;
    double AccBal;
    BankTest(int AccNum, String AccName, double AccBal)
    {
        this.AccNum = AccNum;
        this.AccName = AccName;
        this.AccBal = AccBal;
    }
    void display()
    {
        System.out.println("AccNum: "+ AccNum);
        System.out.println("AccName: "+ AccName);
        System.out.println("AccBal: "+ AccBal);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankTest Cus1 = new BankTest(121,"hemanth", 20000);
        Cus1.display();
        BankTest cus2 = new BankTest(212, "Harsha",998898);
        cus2.display();
    }
}
