import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int count = sc.nextInt();
        int current = sc.nextInt();
        System.out.print(Math.max(0, price * count - current));
    }
}
