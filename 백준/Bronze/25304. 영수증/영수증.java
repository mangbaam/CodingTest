import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        long total = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += (long) a * b;
        }
        if (X == total) System.out.print("Yes"); else System.out.print("No");
    }
}
