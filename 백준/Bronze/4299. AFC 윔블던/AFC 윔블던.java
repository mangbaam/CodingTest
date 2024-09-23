import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = sc.nextInt();
        int cha = sc.nextInt();
        if (cha > hap) System.out.println(-1);
        else {
            int a = (hap + cha) / 2;
            int b = (hap - cha) / 2;
            if (a + b != hap || a - b != cha) System.out.println(-1);
            else {
                System.out.println(a + " " + b);
            }
        }
    }
}
