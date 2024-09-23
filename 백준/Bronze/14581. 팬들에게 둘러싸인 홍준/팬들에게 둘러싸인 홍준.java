import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < 3; i++) System.out.print(":fan:");
        System.out.println();
        for (int i = 0; i < 3; i++) if (i != 1 ) System.out.print(":fan:"); else System.out.print(":" + id + ":");
        System.out.println();
        for (int i = 0; i < 3; i++) System.out.print(":fan:");
    }
}
