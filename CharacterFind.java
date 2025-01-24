import java.util.*;
public class CharacterFind {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a Character:- ");
            char ch = s.next().charAt(0);
            if (ch == 0) {
                break; // dought

            }
            if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
                System.out.println("It is Alphabet: " + ch);
            } else if (ch >= '1' && ch <= '9') {
                System.out.println("It is Numeric: " + ch);
            } else {
                System.out.println("It is a Special Character: " + ch);
            }
        }
    }
}
