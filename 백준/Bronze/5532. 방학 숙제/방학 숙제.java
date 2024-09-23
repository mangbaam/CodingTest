import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int spendA = A / C;
        if (A % C != 0) spendA++;

        int spendB = B / D;
        if (B % D != 0) spendB++;

        System.out.print(L - Math.max(spendA, spendB));
    }
}
