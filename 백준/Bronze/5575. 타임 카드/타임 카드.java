import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int start = 0;
            int end = 0;
            start += sc.nextInt() * 3600;
            start += sc.nextInt() * 60;
            start += sc.nextInt();
            end += sc.nextInt() * 3600;
            end += sc.nextInt() * 60;
            end += sc.nextInt();
            int time = end - start;
            int h = time / 3600;
            int m = time % 3600 / 60;
            int s = time % 60;
            System.out.println(h + " " + m + " " + s);
        }
    }
}
