import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger = Integer.MAX_VALUE;
        int drink = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) burger = Math.min(burger, sc.nextInt());
        for (int i = 0; i < 2; i++) drink = Math.min(drink, sc.nextInt());
        System.out.print(burger + drink - 50);
    }
}
