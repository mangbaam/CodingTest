import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) total += Math.max(sc.nextInt(), 40);
        System.out.print(total / 5);
    }
}
