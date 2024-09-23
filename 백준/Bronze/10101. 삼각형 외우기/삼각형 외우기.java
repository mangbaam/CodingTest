import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A == B && B == C && A == 60) {
            System.out.println("Equilateral");
        } else if (A + B + C != 180) {
            System.out.println("Error");
        } else if (A == B || B == C || C == A) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
