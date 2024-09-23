import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int radius = sc.nextInt();
        System.out.print(radius * 2 * (3.141592) + width * 2);
    }
}
