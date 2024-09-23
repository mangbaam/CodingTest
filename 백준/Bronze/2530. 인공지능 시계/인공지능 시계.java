import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int total = h * 3600 + m * 60 + s + sc.nextInt();
        int nh = (total / 3600) % 24;
        int tmp = total % 3600;
        int nm = tmp / 60;
        int ns = tmp % 60;
        System.out.print(nh + " " + nm + " " + ns);
    }
}
