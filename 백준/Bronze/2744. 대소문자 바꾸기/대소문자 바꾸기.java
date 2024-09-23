import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int diff = 'a' - 'A';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a') {
                System.out.print(Character.toString(c - diff));
            } else {
                System.out.print(Character.toString(c + diff));
            }
        }
    }
}
