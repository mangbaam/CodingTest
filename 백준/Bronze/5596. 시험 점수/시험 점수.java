import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        for (int i = 0; i < 4; i++) A += sc.nextInt();
        for (int i = 0; i < 4; i++) B += sc.nextInt();
        System.out.println(Math.max(A, B));
    }
}
