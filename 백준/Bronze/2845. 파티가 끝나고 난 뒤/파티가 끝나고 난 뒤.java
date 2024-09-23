import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int area = sc.nextInt();
        int countPerArea = count * area;
        for (int i = 0; i < 5; i++) {
            System.out.print(sc.nextInt() - countPerArea + " ");
        }
    }
}
