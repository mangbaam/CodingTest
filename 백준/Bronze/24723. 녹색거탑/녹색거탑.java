import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) answer = 2; else answer *= 2;
        }
        System.out.println(answer);
    }
}
